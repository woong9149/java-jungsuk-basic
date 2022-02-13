

public class Ex7_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 *  상속 (Inheritance)
		 *  - 기존의 클래스로 새로운 클래스를 작성하는 것(코드의 재사용)
		 *  - 두 클래스를 부모와 자식으로 관계를 맺어 주는 것.
		 *  예) class 자식 클래스 extends 부모 클래스 {
		 *  
		 *  }
		 *  - 자손은 조상의 모든 멤버를 상속 받는다.(생성자, 초기화블럭 제외)
		 *  - 자손의 멤버 갯수는 조상보다 많거나 같다.
		 *  - 자손의 변경이 조상에 영향을 미치지 않는다.
		 *  
		 */
	}

}

// 3차원의 점을 위한 클래스 
class Point {
	int x;
	int y;
}

class Point3D extends Point {
	int z;
	// Point 클래스로부터 x, y를 상속받아 가지고 있음.
}

class Parent {}

class Child extends Parent {
	
}