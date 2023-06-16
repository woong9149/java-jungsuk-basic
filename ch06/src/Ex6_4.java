public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add( 5, 3);
		long result2 = mm.subtract( 5, 3);
		long result3 = mm.multiply( 5L, 3L);
		double result4 = mm.divide( 5L, 3L);
		long result5 = mm.max(5L, 3L);
		
		System.out.println("max(5L, 3L) = " + result5);
		System.out.println("add( 5L, 3L) = " + result1);
		System.out.println("subtract( 5L, 3L) = " + result2);
		System.out.println("multiply( 5L, 3L) = " + result3);
		System.out.println("divide( 5L, 3L) = " + result4);
		System.out.println("============== 구구단 ==============");
		mm.gugudan();
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		
		return result;
		//return a + b 가 더 간단함.
	}
	
	long subtract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(double a, double b) {
		return a / b;
	}
	//두 값을 받아서 큰 수를 반환하는 함수
	long max(long a, long b) {
		return a > b ? a : b;
	}
	
	void gugudan() {
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
	}
}
