package com.mystudy.teamproject.concert;

import com.mystudy.teamproject.admin.Admin;
import com.mystudy.teamproject.admin.AdminLogMethod;

public class AllTest {

	public static void main(String[] args) {
		
		ConcertAll ca = new ConcertAll();
		
		ca.joinStart(); //ȸ������ + �α���
		ca.SelectConcert(); //�ܼ�Ʈ Ƽ�� ��ȸ
		ca.startReserv(); //�޴�����
		
	}
}