package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		field1 = 1;	//O 
		field2 = 1;	//X <== default 필드 접근 불가(컴파일 에러)
		field3 = 1;	//X <== private 필드 접근 불가(컴파일 에러)
		
		method1();	//O 
		method2();	//X <== default 메소드 접근 불가(컴파일 에러)
		method3();	//X <== private 메소드 접근 불가(컴파일 에러)
	}
}
