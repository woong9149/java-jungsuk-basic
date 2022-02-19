
public class Ex7_16 {

	public static void main(String[] args) {
		/**
		 *  패키지(package)
		 *  - 서로 관련 있는 클래스들의 묶음
		 *  - 클래스는 클래스 파일(*.class), 패키지는 폴더, 하위 패키지는 하위 폴더
		 *  - 클래스의 실제 이름(full name)은 패키지를 포함한다. ex) java.lang.String
		 *  - 클래스들을 압축한 파일이 rt.jar(java9 부터는 모듈이 도입되서 없어짐)
		 *  
		 *  패키지의 선언
		 *  - 패키지는 소스 파일의 첫번째 문장으로 단 한번 선언
		 *  - 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다.
		 *  - 패키지 선언이 없으면 이름 없는(unnamed, default package) 패키지에 속하게 된다.
		 *  
		 *  클래스 패스(classpath)
		 *  - 클래스 파일(*.class)의 위치를 알려주는 경로(path)
		 *  - 환경변수 classpath로 관리하며, 경로간의 구분자는 ';'를 사용.
		 *  - classpath(환경변수)에 패키지의 루트를 등록해줘야 함.
		 *  
		 *  import문ß
		 *  - 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
		 *  - 컴파일러에게 클래스가 속한 패키지를 알려준다.
		 *  - java.lang 패키지(기본패키지-String,Object,System...emd) 의 클래스는 import하지 않고도 사용할 수 있다.
		 *  
		 *  import문 선언
		 *  - import 패키지명.클래스명; 또는 import 패키지명.*
		 *  - import문은 패키지문과 클래스 선언의 사이에 위치한다.
		 *  - import문은 컴파일 시에 처리되므로 프로그램의 성능에 영향은 없음.
		 *  
		 *  static import문
		 *  - static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
		 *  ex) import static java.lang.Integer.*; -> Integer클래스의 모든 static 메서드.
		 *  	import static java.lang.Math.random; -> Math.random()만.
		 *  	import static java.lang.System.out -> System.out을 out만으로 참조 가능.
		 */
		

	}

}
