package pkg1;

public class MyParent {
	private   int prv; // 같은 클래스
			  int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 다른 패키지의 자손
	public 	  int pub; // 접근제한 없음.
	
	public void printMember() {
		System.out.println(prv); // Ok
		System.out.println(dft); // Ok
		System.out.println(prt); // Ok
		System.out.println(pub); // Ok
	}
}

class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // Ok
		System.out.println(p.dft); // 에러
		System.out.println(p.prt); // Ok
		System.out.println(p.pub); // Ok
	}

}
