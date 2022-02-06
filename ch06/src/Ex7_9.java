
public class Ex7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
	 * 	생성자 this()
	 *  - 생성자에서 다른 생성자 호출할 때 사용
	 *  - 다른 생성자 호출시 첫 줄에서만 사용 가
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
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}