package com.mystudy.ex01_exception;

public class ExceptionFinally {
	
	public static void main(String[] args) {
		// try ~ catch ~ finally
		System.out.println("--- main() ���� ---");
		int num = 20;
		int result = 30;
		try {
			System.out.println(">> try�� ����");
			num = 0;
			result = 100 / num;
			
			System.out.println(">> ����ó�� ���� ����");
			System.out.println(">> try�� ����");
			//return;
		} catch(ArithmeticException e) {
			System.out.println(">>>> catch�� ����");
		} finally { // return; ������ �־ ������ ����
			System.out.println("***> finally : �׻����(������)");
		}
		System.out.println("--------------------");
		
		System.out.println("test() ������ : " + test());
		System.out.println("--- main() ���� ---");
	}
	
	static String test() {
		String result = "";
		int[] num = new int[3]; //�ε��� 0, 1, 2
		try {
			num[3] = 100;
			result = "<�������>";
		} catch (Exception e) { //test() ���⿡�� ����ó��
			result = "<���ܹ߻�>" + e.getMessage();
			e.printStackTrace();
		} finally {
			System.out.println("===> finally ������ ����");
		}
		
		return result;
	}
	
}