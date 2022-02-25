package Thread;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드 요청
		MyThread th1= new MyThread();
		th1.start();
		
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("메인 함수 진행 중!"+i);
		}
	}

}
//1.Thread 클래쓰 상속받아 작업을 구현
class MyThread extends Thread{
	//run오버라이딩
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("스레드 진행 중~"+i);
		}
	}
}
//2) Runnable 인터페이스를 구현하여 작업을 구현
class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("러너블 진행 중"+i);
		}
	}
	
}