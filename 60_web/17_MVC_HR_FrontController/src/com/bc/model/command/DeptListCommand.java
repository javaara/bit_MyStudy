package com.bc.model.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.model.dao.DAO;
import com.bc.model.vo.EmployeeVO;

public class DeptListCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 전달받은 파라미터 값(부서코드: deptno) 추출
		String deptno = request.getParameter("deptno");
		
		//2. DB에서 해당부서(deptno)에 있는 직원 조회(DAO 사용)
		List<EmployeeVO> list = DAO.getDept(deptno);
		
		//3. 조회된 데이터를 응답페이지(deptList.jsp)에서 사용토록 
		//속성에 저장(속성명 : d_list)
		request.setAttribute("d_list", list);
		
		//4. 응답페이지(deptList.jsp)로 응답 위임처리
		//request.getRequestDispatcher("deptList.jsp").forward(request, response);
		
		return "deptList.jsp";
	}
}
