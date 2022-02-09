
public class Ex7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
	 * 	생성자 this()
	 *  - 생성자에서 다른 생성자 호출할 때 사용
	 *  - 다른 생성자 호출시 첫 줄에서만 사용 가능
	 *  
	 *  참조변수 this
	 *  - 인스턴스 자신을 가리키는 참조 변수(인스턴스의 주소가 저장되어있음)
	 *  - 인스턴스 메서드(생성자 포함)에서 사용 가능
	 *  - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
	 *  - static매서드(클래스 메서드)에서는 사용불가
	 */
	}

}

class Car2{
	String color;
	String gearType;
	int door;
	
	Car2() {
		this("white", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door) {
		//this는 참조변수 this
		//생략해도 오류는 안나지만, 로컬변수로 취급받음.
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}