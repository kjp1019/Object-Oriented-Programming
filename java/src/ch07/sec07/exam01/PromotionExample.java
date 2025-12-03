package ch07.sec07.exam01;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}

public class PromotionExample {
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;	//자동타입변환 (상속관계에 있음)
	A a2 = c;	//자동타입변환 (상속관계에 있음)
	A a3 = d;	//자동타입변환 (상속관계에 있음)
	A a4 = e;	//자동타입변환 (상속관계에 있음)
	
	B b1 = d;	//자동타입변환 (상속관계에 있음)
	C c1 = e;	//자동타입변환 (상속관계에 있음)
	
	B b3 = e;	//컴파일 에러(상속 간계에 있지 않음)
	C c2 = d;	//컴파일 에러(상속 간계에 있지 않음)
}
