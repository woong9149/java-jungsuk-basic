
public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AB";
		String s2 = new String("AB");
		
		String s3 = "A" + "B"; // "AB
		/**
		 *  - "" + 7 -> "" + "7" -> "7"
		 *  - 문자열 + any type -> 문자열
		 *  - any type + 문자열 -> 문자
		 */

		int i = 'A';
		System.out.println(i); // 문자 A의 keycode가 출력
		
		//두 변수의 값을 교환
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; // 1. x의 값을 tmp에 저장
		x = y; // y의 값을 x에 저장
		y = tmp; // tmp의 값을 y에 저장
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
