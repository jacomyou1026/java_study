package Thread;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ��û
		MyThread th1= new MyThread();
		th1.start();
		
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("���� �Լ� ���� ��!"+i);
		}
	}

}
//1.Thread Ŭ���� ��ӹ޾� �۾��� ����
class MyThread extends Thread{
	//run�������̵�
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("������ ���� ��~"+i);
		}
	}
}
//2) Runnable �������̽��� �����Ͽ� �۾��� ����
class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("���ʺ� ���� ��"+i);
		}
	}
	
}