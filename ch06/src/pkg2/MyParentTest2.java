package pkg2;

import pkg1.MyParent; // ctrl + shift + o

class MyChild extends MyParent {
	public void printMembers() {
		System.out.println(prv); // Ok
		System.out.println(dft); // Ok
		System.out.println(prt); // Ok
		System.out.println(pub); // Ok
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		System.out.println(p.prv); // Ok
		System.out.println(p.dft); // 에러
		System.out.println(p.prt); // Ok
		System.out.println(p.pub); // Ok
	}

}
