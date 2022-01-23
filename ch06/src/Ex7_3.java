class Data { int x;}

public class Ex7_3 {

	public static void main(String[] args) {
		/**
		 *  <호출 스택>
		 *  - 메서드 수행이 필요한 메모리가 제공되는 공.
		 *  - 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
		 *  - 스택 구조상 아래에 있는 메서드가 위의 메소드를 호출한 것.
		 *  - 맨 위의 메서드 하나만 실행중인 상태고, 나머지 아래에 있는 메서드들은 대기 상태.
		 *  
		 */
		
		/**
		 *  <기본형 매개변수>
		 *  - 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.
		 *  - 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.
		 *  
		 */
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); //10
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) { //기본형 매개변
		x = 1000; //지역변수 x
		System.out.println("change() : x = " + x); // 매개변수로 온 x자체의 값이 바뀌지는 않음.
	}
}
