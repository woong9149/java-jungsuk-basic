
public class Ex6_1 {
	public static void main(String args[]) {
		Tv t;				// Tv 인스턴스를 참조하기 위한 변수 t를 선언 
		t = new Tv();		//Tv 인스턴스를 생성한다
		t.channel = 7;		//Tv 인스턴스의 멤버변수 channel의 값을 7로함
		t.channelDown();    //Tv인스턴스의 메서드 channelDown() 호출 
		
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}
}

class Tv {
	//Tv의 속성(멤버변수) 
	String color;
	Boolean power;
	int channel;
	
	//Tv의 기능
	void power() {
		power = !power; //Tv를 켜거나 끄는 기능을 하는 메서드
	}
	
	void channelUp() {
		++channel; // Tv의 채널을 높이는 기능을 하는 메서드 
	}
	
	void channelDown() {
		--channel; //Tv의 채널을 낮추는 기능을 하는 메서
	}
}