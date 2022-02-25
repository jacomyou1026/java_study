package javaExercise;

class Account1 {
	static final int MIN_BALANCE =0;
	static final int MAX_BALANCE =1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE&&balance>MAX_BALANCE){
			return;
		}
		this.balance=balance;
	}
}

public class AccoutEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account1 account = new Account1();
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		account.setBalance(200000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		account.setBalance(3000000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
	}

}
