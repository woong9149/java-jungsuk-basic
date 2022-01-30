
public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  - 오버로딩(overloading)
		 *  한 클래스 안에 같은 이름의 메서드 여러개를 정의하는 것.
		 *  원래 메서드 : 메서드 이름은 1:1 관계인데, 오버로딩은 n:1이 됨.
		 *  
		 *  오버로딩이 성립하기위한 조건(매개변수는 다르지만 같은 의미의 기능수행)
		 *  1. 메서드 이름이 같아야 한다.
		 *  2. 매개변수의 개수 또는 타입이 달라야 한다.
		 *  3. 반환 타입은 영향없다.
		 */
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));
		
		int[] a = { 100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		
	}

}

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - "); 
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	} 
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i] ;
		}
		
		return result;
	}
}