
public class Ex7_1 {

	int iv;				//인스턴스 변수
	static int cv;		//클래스 변수(static변수, 공유변수)
	
	void method() {
		int lv = 0;		//지역 변수 
	}
	
	/**
	 *  클래스 변수 - 클래스 영역에 선언 - 클래스가 메모리에 올라갈 때 생성
	 *  인스턴스 변수 - 클래스 영역에 선언 - 인스턴스가 생성되었을 때 생성
	 *  지역 변수 - 클래스 영역 이외의 영역 - 변수 선언문이 수행되었을 때 생성
	 *  	(메서드, 생성자, 초기화 블럭 내부)
	 *  
	 */
	
	public static void main(String args[]) {
		Card c = new Card();
		//인스턴스 변수 => 인스턴스를 통해서 접근 
		c.kind = "HEART";
		c.number = 5;

		//클래스 변수 => 클래스명으로 접근(객체 생성없이 사용 가능)

		//사용 가능하나 권장x
		c.width = 200;
		c.height = 300;

		//권장
		Card.width = 200;
		Card.height = 300;
	}
}

class Card {
	//인스턴스 변수
	String kind;	//무늬
	int number;		//숫자
	
	//클래스 변수
	static int width = 100; 	//폭
	static int height = 250;	//높이
	
	/**
	 *  - 인스턴스 변수는 개별 속성 => 개별 객체마다 다르게 유지되어야함.
	 *  - 클래스 변수는 공통 속성 => 모든 객체 공통으로 적용되어야함.
	 */
}



