package Thread;

public class MainThread {
	public static void main(String[] args) {
		Thread_2 t3=new Thread_2();
		t3.start();
		
		System.out.println("���� ����ǰ� �ִ� �������� �̸�: "+Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ����: "+Thread.currentThread().getState());
		System.out.println("���� ����ǰ� �ִ� �������� �켱����: "+Thread.currentThread().getPriority());
	}

}
class Thread3 extends Thread{
	public void run() {
		this.setName("Thread3");
		System.out.println("���� ����ǰ� �ִ� �������� �̸�: "+Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ����: "+Thread.currentThread().getState());
		System.out.println("���� ����ǰ� �ִ� �������� �켱����: "+Thread.currentThread().getPriority());

	}
}
