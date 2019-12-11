package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Insert {

	public static void main(String[] args) {
		//JDBC�� �̿��� DB ���α׷��� ���� -------------------
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		//2. DB����  - Connection ��ü ���� <-DriverManager
		//3. Statement�� ����(SQL�� ����)
		//4. SQL ���� ����� ���� ó��
		//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
		//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		//============================================
		
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		Connection conn = null;
		Statement stmt = null;
		
			
			try {
				//1. JDBC ����̹� �ε�
				Class.forName("oracle.jdbc.OracleDriver");
				
				//2. DB����  - Connection ��ü ���� <-DriverManager
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", 
						"mystudy", "mystudypw");
				
				//3. Statement�� ����(SQL�� ����)
				//3-1. Connection ��ü�κ��� Statement ��ü ����
				stmt = conn.createStatement();
				
				//3-2. Statement ��ü�� �̿��ؼ� SQL�� ����
				String sql ="";
				String id = "2019006";
				String name = "ȫ�淡";
				int kor = 100;
				int eng = 90;
				int math = 80;
				
				sql += "INSERT INTO STUDENT ";
				sql += "       (ID, NAME, KOR, ENG, MATH) ";
				sql += "VALUES ('" + id + "', '" + name + "', " + kor + ", " + eng + ", " + math + ") ";
				//sql += "VALUES ('2019006', 'ȫ�淡' + 100, 90, 80) ";
				
				System.out.println("sql : " + sql);
				
				int result = stmt.executeUpdate(sql);
				
				//4. SQL ���� ����� ���� ó��
				//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
				//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
				System.out.println(">> ó���Ǽ� : " + result);
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
				try {
					if (stmt != null) stmt.close();
					System.out.println(">> Statement close ����");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (conn != null) conn.close();
					System.out.println(">> Connection close ����");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}

}