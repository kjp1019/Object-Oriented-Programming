package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// int[] intArray = null;
		int[] intArray = new int[3];
		intArray[0] = 10;	// intArray = {10, 0, 0}
		
		//String str = null;
		String str = "홍길동";
		System.out.println("총 문자수: " + str.length());	//NullPointerException
	}
}
