<%@page import="com.bc.mybatis.ShopDAO"%>
<%@page import="com.bc.mybatis.ShopVO"%>
<%@page import="java.util.List"%>
<%@page import="com.bc.mybatis.DBService"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 전달받은 제품분류목록 값에 해당하는 제품정보를 DB에서 조회
	화면에 목록형태(테이블)로 표시 --%>
<%
	//전달받은 파라미터 값 추출
	String category = request.getParameter("category");
%>
	<%-- 방법2 : DAO 이용 --%>
	<jsp:useBean id="dao" class="com.bc.mybatis.ShopDAO" scope="session"/>
	
<%
	/* EL, JSTL 버전으로 변경처리하기 위해 주석처리
	List<ShopVO> list = dao.list(category);
	for (ShopVO vo : list) {
		System.out.println(vo);
	}
	*/
	//EL, JSTL 버전으로 사용하기 위한 코드 추가
	pageContext.setAttribute("list", dao.list(category));
%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품목록</title>
<style>
	table {
		width: 600px;
		margin: 30px auto 0 auto; /* 상 우 하 좌 */
		border: 1px solid navy;
		border-collapse: collapse;
		font-size: 0.8em;
	}
	th, td { border: 1px solid navy; padding: 4px; }
	th { background-color: #dedede; }
	.red { color: red; }
</style>
</head>
<body>
	<jsp:include page="shop.jsp"/>
	<table>
		<tr>
			<th width="15%">제품번호</th>
			<th width="10%">이미지</th>
			<th width="20%">제품명</th>
			<th width="20%">제품가격</th>
			<th>비고</th>
		</tr>

		<c:if test="${list.size() <= 0 }">
			<tr>
				<td colspan='5'>
					현재 등록된 데이터가 없습니다.
				</td>
			</tr>
		</c:if> 
		
		<c:if test="${list.size() > 0 }">
			<c:forEach var="vo" items="${list }">
				<tr>
					<td>${vo.getP_num() }</td>
					<td>
						<img src="images/${vo.getP_image_s() }"
							width="100px" height="95px">
					</td>
					<td>
						<a href="product_content.jsp?p_num=${vo.getP_num() }">
							${vo.getP_name() }
						</a>
					</td>
					<td>할인가 : ${vo.getP_saleprice() }원<br>
						<span class="red">(할인율 : ${vo.getPercent() }%)</span>
					</td>
					<td>시중가격 : ${vo.getP_price() }원</td>
				</tr>
			</c:forEach>
		</c:if>

	</table>

</body>
</html>