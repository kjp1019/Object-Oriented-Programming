package ch06.sec13.exam02.package1;

public class A {
	//필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// public 접근 제한 생성자 선언
	public A(boolean b) {
		//모든 패키지
	}
	// default 접근 제한 생성자 선언
	A(int b) {
		//같은 패키지 내에서만
	}
	
	//private 접근 제한 생성자 선언
	private A(String a) {
		//class 내부에서만
	}
}
