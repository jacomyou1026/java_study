
package Thread;

public class Money1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);

		son.start();
		mom.start();
	}

}

class Account {
	int money = 0;

	public int showMoney() {
		return money;
	}

	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		this.money += 2000;
		System.out.println("어머니가 용돈을 입금했습니다. 현재잔액: " + this.showMoney());
		this.notify();
	}

	public synchronized void getMoney() throws InterruptedException {
		while (money <= 0) {
			try {
				System.out.println("토옥 잔고가 없어서 아들 대기 중");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		Thread.sleep(1000);
		this.money -= 2000;
		System.out.println("아들이 용돈을 출금했습니다. 현재 잔액은 " + this.showMoney());
	}
}

class Son extends Thread {
	private Account account;

	Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				account.getMoney();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class Mom extends Thread {
	private Account account;

	Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.setMoney();
		}
	}
}