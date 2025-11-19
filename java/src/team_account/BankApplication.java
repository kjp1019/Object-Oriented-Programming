package team_account;

import java.util.Scanner;

public class BankApplication {
	private static int MAX = 100;	// 최대 수
	private static Account[] accounts = new Account[MAX];
	private static int size = 0;	//실제로 저장된 계좌 수
	
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("선택> ");
            String select = scanner.nextLine();

            switch (select) {
                case "1": 
                	createAccount(); 
                	break;
                case "2": 
                	listAccounts(); 
                	break;
                case "3": 
                	deposit(); 
                	break;
                case "4": 
                	withdrawal(); 
                	break;
                case "5":
                    System.out.println("프로그램 종료");
                    return;	//종료
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
        }
    }

    private static void printMenu() {
    	System.out.println("-------------------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("-------------------------------------------");
    }

    // 1. 계좌생성
    private static void createAccount() {
        if (size >= MAX) {	//최대 길이가 100
            System.out.println("더 이상 계좌를 생성할 수 없습니다.");
            return;
        }
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");
        
        System.out.print("계좌번호: ");
        String accountNum = scanner.nextLine();
      
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        String balanceStr = scanner.nextLine();
        int balance = Integer.parseInt(balanceStr);
        if (balance < 0) {
            System.out.println("초기입금액이 올바르지 않습니다.");
            return;
        }
        Account account = new Account(accountNum, owner, balance);
        accounts[size] = account;
        size++;

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    // 2. 계좌목록
    private static void listAccounts() {
    	System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");
        if (size == 0) {
            System.out.println("(등록된 계좌가 없습니다.)");
            return;
        }
        for (int i = 0; i < size; i++) {
        	Account account = accounts[i];
            System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
        }
        System.out.println();
    }

    // 3. 예금
    private static void deposit() {
    	System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        
        System.out.print("계좌번호: ");
        String accountNum = scanner.nextLine();
        
        System.out.print("예금액: ");
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr);
        
        Account account = findAccount(accountNum);
        
        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 4. 출금
    private static void withdrawal() {
    	System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        
        System.out.print("계좌번호: ");
        String accountNum = scanner.nextLine();
        System.out.print("출금액: ");
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr);
        
        Account account = findAccount(accountNum);
        
        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        
        if (account.getBalance() < money) {
        	System.out.println("결과: 잔액이 부족합니다");
        	return;
        }
    
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // 계좌번호로 Account 검색
    private static Account findAccount(String accountNum) {
    	for (int i = 0; i < size; i++) {
    		if(accounts[i].getAno().equals(accountNum)) {
    			return accounts[i];
    		}
    	}
    	return null;	//못 찾으면 nul
    }
}
