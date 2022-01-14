import java.util.*;

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Scanner - 화면으로부터 데이터를 입력받는 기능을 제공하는 클래
		 */
		Scanner scanner = new Scanner(System.in); //Scanner객체 생성
												//System.in 화면에서 입력받음 
		
		int num1 = scanner.nextInt(); // scanner 객체 사용
		int num2 = scanner.nextInt(); //nextInt()는 정수를 받음 
		System.out.println(num1);
		System.out.println(num2);
		
		String input = scanner.nextLine(); //nextLine()은 한 행 단위로 입력받음 
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
