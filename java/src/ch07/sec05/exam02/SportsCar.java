package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
	}
	
	//오버라이딩할 수 없음
	@Override
	public void stop() {
		System.out.println("스포트카를 멈춤");
		speed = 0;
	}
}
