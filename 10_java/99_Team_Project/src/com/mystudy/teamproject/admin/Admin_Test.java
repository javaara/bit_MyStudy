package com.mystudy.teamproject.admin;

public class Admin_Test {
	
	public static void main(String[] args) {		
		
//		new AdminLogMethod().inputIdPw();
		
		Admin ad = new Admin();		
		AdminLogMethod login = new AdminLogMethod();
		
		login.inputIdPw();
		ad.AdminMenu();
		
	
	}
}
