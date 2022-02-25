package Thread;

public class MainThread {
	public static void main(String[] args) {
		Thread_2 t3=new Thread_2();
		t3.start();
		
		System.out.println("현재 실행되고 있는 스레드의 이름: "+Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태: "+Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위: "+Thread.currentThread().getPriority());
	}

}
class Thread3 extends Thread{
	public void run() {
		this.setName("Thread3");
		System.out.println("현재 실행되고 있는 스레드의 이름: "+Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태: "+Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위: "+Thread.currentThread().getPriority());

	}
}
