package Thread;


public class ShareBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread mon = new Thread(atm,"����");
		Thread dad= new Thread(atm,"�ƺ�");
		
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
		System.out.println(Thread.currentThread().getName()+" ��(��)"+money+"�� ���");
	}
	void printInfo() {
		System.out.println("�����ܾ�:"+this.money+"�Դϴ�.");
	}
	
}