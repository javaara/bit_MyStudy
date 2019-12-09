--PL/SQL 프로시저(procedure)
SET SERVEROUT ON; --DBMS 실행 결과 확인을 위해 설정

DECLARE --변수선언
    V_EMPID NUMBER;
    V_NAME VARCHAR2(30);
BEGIN --실행문의 시작
    V_EMPID := 100; --치환문(대입문) 부호 :=
    V_NAME := '홍길동';
    
    DBMS_OUTPUT.PUT_LINE(V_EMPID || ' ' || V_NAME);
END; --실행문의 끝

--===========================================
DECLARE
    V_BOOKID NUMBER(2);
    V_BOOKNAME VARCHAR2(40);
    V_PUBLISHER VARCHAR2(40);
    V_PRICE NUMBER(8);
BEGIN
    SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE
      INTO V_BOOKID, V_BOOKNAME, V_PUBLISHER, V_PRICE
      FROM BOOK
     WHERE BOOKID = 6;
     
     DBMS_OUTPUT.PUT_LINE(V_BOOKID ||':'|| V_BOOKNAME
            ||':'|| V_PUBLISHER ||':'|| V_PRICE);
END;
--------------------------------
/******* 저장프로시저(Stored procedure) 
매개변수 유형
--IN : 입력 받기만 하는 변수(매개변수)
--OUT : 출력만 하는 변수(값을 받을 수 없고, 
        프로시저 실행 후 호출한 곳으로 변수를 통해 데이터 전달)
--IN OUT : 입력도 받고, 값을 변수를 통해 출력도 함 
************************************/
CREATE OR REPLACE PROCEDURE BOOK_DISP
--매개변수 선언부 : ( )안에 작성
(
    IN_BOOKID IN NUMBER
)
AS 
--변수 선언부(AS 또는 IS ~ BEGIN문 사이)
    V_BOOKID NUMBER(2);
    V_BOOKNAME VARCHAR2(40);
    V_PUBLISHER VARCHAR2(40);
    V_PRICE NUMBER(8);
BEGIN
    SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE
      INTO V_BOOKID, V_BOOKNAME, V_PUBLISHER, V_PRICE
      FROM BOOK
     WHERE BOOKID = IN_BOOKID;
     
     DBMS_OUTPUT.PUT_LINE(V_BOOKID ||':'|| V_BOOKNAME
            ||':'|| V_PUBLISHER ||':'|| V_PRICE);
END;

---------------------
--프로시저 실행 : EXECUTE 키워드(명령문) 사용
EXECUTE BOOK_DISP(1);
EXEC BOOK_DISP(2);

--프로시저 삭제
DROP PROCEDURE BOOK_DISP;

--=======================================
--GET_BOOKINFO(IN, OUT, OUT, OUT)
CREATE OR REPLACE PROCEDURE GET_BOOKINFO (
    IN_BOOKID IN NUMBER,
    OUT_BOOKNAME OUT VARCHAR2,
    OUT_PUBLISHER OUT VARCHAR2,
    OUT_PRICE OUT NUMBER
) AS
    --%TYPE : 테이블명.컬럼명%TYPE
    --테이블의 컬럼과 동일한 타입으로 선언(변경시에도 적용)
    V_BOOKID BOOK.BOOKID%TYPE;
    V_BOOKNAME BOOK.BOOKNAME%TYPE;
    V_PUBLISHER BOOK.PUBLISHER%TYPE;
    V_PRICE BOOK.PRICE%TYPE;
BEGIN
    SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE
      INTO V_BOOKID, V_BOOKNAME, V_PUBLISHER, V_PRICE
      FROM BOOK
     WHERE BOOKID = IN_BOOKID;
     
     --데이터를 호출한 곳으로 전달하기 위해 변수에 저장
     OUT_BOOKNAME := V_BOOKNAME;
     OUT_PUBLISHER := V_PUBLISHER;
     OUT_PRICE := V_PRICE;
     
     DBMS_OUTPUT.PUT_LINE(V_BOOKID ||':'|| V_BOOKNAME
            ||':'|| V_PUBLISHER ||':'|| V_PRICE);    
END;

---------------------------------------
--프로시저 OUT 매개변수 값 확인
create or replace PROCEDURE GET_BOOKINFO_TEST (
    IN_BOOKID IN NUMBER
) AS 
    V_BOOKNAME BOOK.BOOKNAME%TYPE;
    V_PUBLISHER BOOK.PUBLISHER%TYPE;
    V_PRICE BOOK.PRICE%TYPE;    
BEGIN
    DBMS_OUTPUT.PUT_LINE('입력받은 값(ID) : ' || IN_BOOKID);

    -- GET_BOOKINFO 프로시저 호출(실행)
    GET_BOOKINFO(IN_BOOKID, V_BOOKNAME, V_PUBLISHER, V_PRICE);
    
    -- 실행결과 전달 받은 값(OUT) 화면 출력
    DBMS_OUTPUT.PUT_LINE('>>BOOKINFO_TEST결과 - ' || IN_BOOKID
            ||':'|| V_BOOKNAME ||':'|| V_PUBLISHER ||':'|| V_PRICE); 
END;

--=============================================
/* (실습) : 고객테이블(CUSTOMER)에 있는 데이터 조회 프로시저 작성
프로시저명 : GET_CUST_INFO
입력받는 값 : 고객ID 값
처리 : 입력받은 고객ID에 해당하는 데이터를 화면에 출력
---- 고객ID, 고객명, 주소, 전화번호 출력
************************************/

CREATE OR REPLACE PROCEDURE GET_CUST_INFO (
    IN_CUSTID IN NUMBER
) AS
    V_CUSTID CUSTOMER.CUSTID%TYPE;
    V_NAME CUSTOMER.NAME%TYPE;
    V_ADDRESS CUSTOMER.ADDRESS%TYPE;
    V_PHONE CUSTOMER.PHONE%TYPE;
BEGIN
    SELECT CUSTID, NAME, ADDRESS, PHONE 
      INTO V_CUSTID, V_NAME, V_ADDRESS, V_PHONE
      FROM CUSTOMER 
     WHERE CUSTID = IN_CUSTID;
    
    DBMS_OUTPUT.PUT_LINE(V_CUSTID ||', '|| V_NAME ||', '|| 
                        V_ADDRESS ||', '|| V_PHONE);
END;