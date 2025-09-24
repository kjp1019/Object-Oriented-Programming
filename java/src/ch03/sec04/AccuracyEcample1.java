package ch03.sec04;

public class AccuracyEcample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		int totalPieces = (int)(apple / pieceUnit);	// 1/0.1 = 10
		int remainPieces = totalPieces - number;
		
		double result = remainPieces * pieceUnit;
		System.out.println("10조각에서 남은 조각: " + remainPieces);
		System.out.printf("사과 1개에서 남은 양: %.1f\n", result);
	}

}
