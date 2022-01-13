
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
	}

}
