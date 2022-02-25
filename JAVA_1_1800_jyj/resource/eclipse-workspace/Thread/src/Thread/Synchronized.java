package Thread;

public class Synchronized {

	public static void main(String[] args) {
		MyThreadB s1 = new MyThreadB();
		Thread t1 = new Thread(s1, "A");
		Thread t2 = new Thread(s1, "B");
		Thread t3 = new Thread(s1, "C");

		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThreadB implements Runnable {

	Ticketing ticket = new Ticketing();

	@Override
	public void run() {
		// TODO Auto-nerated method stub
		ticket.ticketing();
	}

}

class Ticketing {
	int ticketNumber = 1;

	public void ticketing() {
		synchronized (this) {
			try {
				Thread.sleep(10 0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (ticketNumber > 0) {
				System.out.println(Thread.currentThread().getName() + "가 티켓팅 성공!");
				ticketNumber--;
			} else {
				System.out.println(Thread.currentThread().getName() + "티켓팅 실패!");
			}
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 시도 후 티켓수:" + ticketNumber);
		}
	}
}