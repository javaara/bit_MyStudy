package com.mystudy.teamproject.admin;

import java.util.Scanner;

public class AdminLogMethod {
	private String id;
	private String password;
	Scanner scan = new Scanner(System.in);
	
	public boolean inputIdPw() {
		boolean inputLog = false;
		System.out.println("========================");
		System.out.println("[환영합니다 로그인을 시작합니다]");
		System.out.println("========================");
		
		while(true) {
			System.out.print("아이디 : ");
			id = scan.nextLine(); // 아이디 입력
			
			System.out.print("비밀번호 : ");
			password = scan.nextLine(); // 비밀번호 입력
			
			AdminVO lvo = new AdminVO(id, password);
			 
			boolean logTrue = new AdminLogDAO().checkIdPassword(lvo);
			
			if (logTrue) {
				inputLog = true;
				//System.out.println("로그인 하셨습니다");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}			
		}
		return inputLog;
	}
	
	

}



