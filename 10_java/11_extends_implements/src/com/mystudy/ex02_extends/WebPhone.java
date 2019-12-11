package com.mystudy.ex02_extends;
/* Ŭ������ ���(extends) �ǽ�
�ǽ�1: Phone Ŭ������ ��� Ȯ��(extends)
WebPhone Ŭ���� �ۼ�
	- Phone Ŭ���� ��� Ȯ���ؼ� �����
	- ������ ����
		* ����ȣ(phoneNo)�� �޾Ƽ� ��ü(�ν��Ͻ�) ����
		* Ÿ�� ���� "WebPhone Ÿ��"���� �ۼ�
	- ��� : ��ȭ�ɰ�, �ް�, ��������, ���˻� 
	- ���˻� ���
		webSearch() : ">> WebPhone - �� �˻�" ���� ȭ�� ���
*/
class WebPhone extends Phone {
	public WebPhone(String phoneNo) {
		super("WebPhone Ÿ��", phoneNo);
	}
	
	public void webSearch() {
		System.out.println(">> WebPhone - ���˻�");
	}
}