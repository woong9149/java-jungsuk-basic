
public class VarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); //'3' - '0' => 3
		System.out.println('3' - '0' + 1); //52
		System.out.println(Integer.parseInt("3") + 1); //4
		System.out.println("3" + 1); // "3" + 1 => "3" + "1" => "31"
		System.out.println(3 + '0'); // '0'은 숫자 48 => 51
		
		/**
		 *  - 단항(1항) 연산자가 이항(2항) 연산자 보다 우선 순위가 높다.(단항 > 이항 > 삼항) 
		 *  - 연산에서 곱셈 나눗셈이 덧셈과 뺄셈보다 우선 순위가 높다.
		 *  - 산술 연산이 비교 연산 보다 우선 순위가 높다.
		 *  - 비교 연산이 논리 연산( ||, && 등) 보다 우선 순위가 높다.
		 *  - 대입 연산은 우선순위가 가장 낮다.
		 *  - 괄호로 우선순위를 부여할 수 있다.
		 *  
		 *  <연산자의 결합 규칙>
		 *  - 대입과 단항 연산자를 제외하면, 모두 왼쪽 -> 오른쪽
		 */
	}

}
