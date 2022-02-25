package Thread;


public class ShareBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread mon = new Thread(atm,"엄마");
		Thread dad= new Thread(atm,"아빠");
		
		mon.start();
		dad.start();
	}

}
class ATM implements Runnable{
	int money = 100000;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			withdraw(100);
			printInfo();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}}
	}
synchronized void withdraw(int money) {
		Thread.yield();
		this.money -=money;
		System.out.println(Thread.currentThread().getName()+" 이(가)"+money+"원 출금");
	}
	void printInfo() {
		System.out.println("현재잔액:"+this.money+"입니다.");
	}
	
}