class Data2 { int x;}

public class Ex7_5 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x); //10
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) { //참조형 매개변수
		d.x = 1000; 
		System.out.println("change() : x = " + d.x); // 매개변수로 온 매개변수의 x값이 바뀜.
	}
}
