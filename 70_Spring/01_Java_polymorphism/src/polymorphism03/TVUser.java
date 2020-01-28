package polymorphism03;

public class TVUser {

	public static void main(String[] args) {
		//삼성 또는 엘지 TV 사용
		BeanFactory factory = new BeanFactory();
		//TV tv = (TV) factory.getBean("samsung");
		
		TV tv = (TV) factory.getBean(args[0]);
	
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
