class Tv {
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv { //SmartTv는 Tv에 caption(자막)을 보여주는 기능을 하는 클래스.
	boolean caption; // 자막 상태(on/off)
	
	void displayCaption(String text) {
		if(caption) { //caption의 상태가 true 일 때만 자막을 보여준다.
			System.out.println(text);
		}
	}
	
}

public class Ex7_11 {

	public static void main(String[] args) {
		SmartTv sTv = new SmartTv();
		sTv.channel = 10; //조상 클래스로부터 상속 받은 멤버
		sTv.channelUp(); //조상 클래스로부터 상속 받은 멤버
		
		System.out.println(sTv.channel);
		
		sTv.displayCaption("Hello, World!");
		sTv.caption = true; // 자막 기능을 켠다.
		sTv.displayCaption("Hello, World!");
		
	}
}