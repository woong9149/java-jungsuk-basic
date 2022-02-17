
public class Ex7_15 {

	public static void main(String[] args) {
		/**
		 *  참조변수 super
		 *  - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재
		 *  - 조상의 멤버를 자신의 멤버와 구별할 때 사용
		 * 
		 *  super() - 조상의 생성자
		 *  - 조상의 생성자를 호출할 때 사용
		 *  - 조상의 멤버는 조상의 생성자를 통해 초기화
		 *  - 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.
		 *  	그렇지 않으면 컴파일러가 생성자의 첫 줄에 super()를 삽입
		 */
		Child2 c = new Child2(3, 5);
		c.method();

	}

}

class Parent2 {
	int x = 10; /* super.x */
	int y;
	
	Parent2(int y) {
		this.y = y;
	}
}

class Child2 extends Parent2 {
	int x = 20; //this.x
	int z;
	/**
	 *  Child2 클래스에 x가 없을 때는 Parent2의 x가 this.x , super.x 둘 다 가능
	 */
	Child2(int y, int z) {
		super(y); // 조상클래스의 생성자 Parent2(int y)를 호출
		this.z = z; // 자신의 멤버를 초기화
	}
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}