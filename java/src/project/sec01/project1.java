package project.sec01;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		int amount = 0;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("예금액: ");
				String input = scanner.nextLine();
				amount = Integer.parseInt(input);
				money += amount ;
				System.out.println("잔고: " + money);
			}
			else if(strNum.equals("2")) {
				System.out.println("출금액: ");
				String input = scanner.nextLine();
				amount = Integer.parseInt(input);
				money -= amount ;
				System.out.println("잔고: " + money);
			}
			else if(strNum.equals("3")) {
				System.out.println("잔고: " + money);
			}
			else if(strNum.equals("4")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
