
public class Hello2 {
	/**
	 *  - 하나의 소스 파일에 여러 클래스 작성
	 *  	- 하나의 소스 파일에는 하나의 public class만 허용
	 *  	- public class가 있는 경우, 소스 파일의 이름은 반드시 public class의 이름과 일치해야 한다.
	 *  	- public class가 하나도 없는 경우, 소스 파일의 이름은 class들 중 아무이름이나 가능하다.
	 *  	- class 내의 변수와 메서드는 멤버 
	 *  
	 *  1. 객체의 생성
	 *  클래스명 변수명; //클래스의 객체를 참조하기 위한 참조변수를 선언 
	 *  변수명 = new 클래스명(); // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장 
	 *  
	 *  ex) Tv t; // Tv클래스 타입의 참조변수 t를 선언 
	 *  	t = new Tv(); // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장 
	 *  	=> Tv t = new Tv();
	 *  
	 *  2. 객체의 사용
	 *  t.channel = 7; //Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
	 *  t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
	 *  System.out.println("현재 채널은 " + t.channel + " 입니다. ");
	 *  
	 *  - 하나의 인스턴스를 여러 개의 참조변수가 가리키는 경우는 가능.
	 *  - 여러 인스턴스를 하나의 참조변수가 가리키는 경우는 불가능.
	 *  
	 */
}

class Hello3 {}
