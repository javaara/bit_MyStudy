package polymorphism02;

public class TVUser {

	public static void main(String[] args) {
		//삼성TV 사용
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		//SamsungTV -> LgTV 변경사용
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
