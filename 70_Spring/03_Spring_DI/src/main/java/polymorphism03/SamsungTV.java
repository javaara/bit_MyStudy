package polymorphism03;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV 생성");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println(">> SamsungTV(Speaker) 객체생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println(">> SamsungTV(Speaker,price) 객체생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public SamsungTV(SonySpeaker speaker, int width, int height) {
		System.out.println(">> SamsungTV(Speaker,width,height) 객체생성");
		this.speaker = speaker;
		this.width = width;
		this.height = height;
	}
	public void powerOn() {
		System.out.println("SamsungTV - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV - 소리크게");
		speaker.volumnUp();
	}
	public void volumnDown() {
		System.out.println("SamsungTV - 소리작게");
		speaker.volumnDown();
	}
	//------setter, getter 추가 ----------
	public SonySpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//--------------------------------
	public void initMethod() {
		System.out.println("SamsungTV - initMethod() 실행");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV - destroyMethod() 실행");
		
	}
	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
	
}








