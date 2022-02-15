public class Ex7_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  포함(composite) 관계
		 *  - 클래스의 멤버로 참조변수를 선언하는 것
		 *  - 작은 단위의 클래스를 만들고, 이 클래스들을 조합해서 클래스를 만든다.
		 *  
		 *  클래스 간의 관계 결정하기
		 *  - 상속관계 : 'A는 B이다.(is-a)'
		 *  - 포함관계 : 'A는 B를 가지고있다.(has-a)'
		 */
	}

}

class Circle { // Circle이 Point를 포함하는 관계
	Point c = new Point();
	int r;
}
