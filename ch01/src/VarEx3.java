
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int score = 100;
		//지역변수는 사용하기 전에 초기화를 해야한다.
		System.out.println(score);
		
		boolean power = true;
		System.out.println(power);
		
		byte b = 127; //byte 타입의 범위 // -128~127
		System.out.println(power);
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0X10; // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
		long l = 1_000_000_000; // 20억 이상은 접미사 L을 붙여야함 
		System.out.println(l);
		
		float f = 3.14f;
		double d = 3.14f; //타입의 범위가 더 넓으면 상관음. 
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(10.); //10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
		
	}

}
