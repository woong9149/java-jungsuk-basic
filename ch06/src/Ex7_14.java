
public class Ex7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  단일 상속( Single Inheritance)
		 *  - Java는 단일 상속만 허용한다(C++은 다중상속 허용) :인터페이스로 다중 상속의 효과를 낼 수 있음
		 *  - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
		 *  
		 *  Object 클래스 - 모든 클래스의 조상
		 *  - 부모가 없는 클래스(상속받지 않은 클래스)는 자동적으로 Object 클래스를 상속받게 된다.
		 *  - 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
		 *   예) toString(), equals(Object obj), ... 등
		 *   
		 *   오버라이딩(overridiing)
		 *   - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것.
		 *   
		 *   오버라이딩의 조건
		 *   - 선언부가 조상 클래스의 메서드와 일치해야 한다.(선언부가 일치해야함 - 반환타입, 메서드 이름, 매개변수 등)
		 *   - 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
		 *   - 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
		 *   
		 *   오버로딩 vs 오버라이딩
		 *   오버로딩(overloading) - 기존에 없는 새로운 메서드를 정의하는 것(new)
		 *   오버라이딩(overriding) - 상속받은 메서드의 내용을 변경하는 것(modify)
		 *   
		 *    
		 */
	}
}
