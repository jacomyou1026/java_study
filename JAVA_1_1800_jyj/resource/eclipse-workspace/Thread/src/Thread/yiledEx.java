package Thread;

public class yiledEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 s1 =new MyThread6();
		MyThread7 s2 =new MyThread7();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
	}

}
class MyThread6 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<30;i++) {
			System.out.print("¡Ú");
			Thread.yield(); //¾çº¸
		}
	}
	
}
class MyThread7 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<30;i++) {
			System.out.print("¡Ù");
		}
	}
	
}