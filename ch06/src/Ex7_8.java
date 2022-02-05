
public class Ex7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  생성자(constructor)
		 *  - 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
		 *  - 인스턴스 생성시 수행할 작업(iv 초기)에 사용 
		 * 
		 *  생성자 규칙
		 *  - 이름이 클래스 이름과 같아야 한다.(오버로딩 개념) 
		 *  - 리턴값이 없다.(void 생략) 
		 *  - 모든 클래스는 반드시 1개 이상의 생성자를 가져야 한다.(생성자가 없을 때는 컴파일러가 기본생성자를 생성한다.) 
		 *  
		 *  기본 생성자(default constructor)
		 *  - 매개변수가 없는 생성자 
		 *  - 생성자가 하나도 없을 때만, 컴파일러가 기본 생성자 자동 추가 
		 */
	}
	
	Data_1 d1 = new Data_1();
	Data_2 d2 = new Data_2(); //compile error 발

}

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) { // 매개변수가 있는 생성
		value = x;
	}
}
