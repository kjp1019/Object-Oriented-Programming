package team_account;

public class Account {
	//필드(계좌정보)
	private String accountNum;	// 계좌번호
    private String owner;		// 예금주
    private int balance;        // 잔액
    
    //생성자
    public Account(String accountNum, String owner, int balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }
    
    // Getter, Setter
    public String getAno() { 
    	return accountNum; 
    }
    public void setAno(String accountNum) {
    	this.accountNum = accountNum;
    }
    public String getOwner() { 
    	return owner;
    }
    public void serOwner(String owner) {
    	this.owner = owner;
    }
    public int getBalance() { 
    	return balance;
    }
    public void setBalance(int balance) {
    	this.balance = balance;
    }
}
