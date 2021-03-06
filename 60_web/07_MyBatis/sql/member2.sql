CREATE TABLE MEMBER2 (
    IDX NUMBER(5) PRIMARY KEY,
    ID VARCHAR2(10),
    PWD VARCHAR2(10),
    NAME VARCHAR2(30),
    AGE NUMBER(3),
    ADDRESS VARCHAR2(150),
    REG DATE
);
CREATE SEQUENCE MEMBER2_SEQ;
INSERT INTO MEMBER2 
       (IDX, ID, PWD, NAME, AGE, ADDRESS, REG)
VALUES (MEMBER2_SEQ.NEXTVAL, 'admin', 'admin', '관리자', null, null, SYSDATE);
INSERT INTO MEMBER2 
       (IDX, ID, PWD, NAME, AGE, ADDRESS, REG)
VALUES (MEMBER2_SEQ.NEXTVAL, 'test1', 'test1', '홍길동', 27, '서울', SYSDATE);

INSERT INTO MEMBER2 
       (IDX, ID, PWD, NAME, AGE, ADDRESS, REG)
VALUES (MEMBER2_SEQ.NEXTVAL, 'test2', 'test2', '홍길동2', 27, '서울', SYSDATE);

COMMIT;
SELECT * FROM MEMBER2;