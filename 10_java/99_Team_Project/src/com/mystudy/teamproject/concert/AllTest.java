package com.mystudy.teamproject.concert;

import com.mystudy.teamproject.admin.Admin;
import com.mystudy.teamproject.admin.AdminLogMethod;

public class AllTest {

	public static void main(String[] args) {
		
		ConcertAll ca = new ConcertAll();
		
		ca.joinStart(); //회원가입 + 로그인
		ca.SelectConcert(); //콘서트 티켓 조회
		ca.startReserv(); //메뉴선택
		
	}
}
