package Thread;

public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Runnable t = new Thread_2();
			Thread t1 = new Thread(t,"thread1");			//new Thread(target,name)
			t1.setPriority(1);
			
			System.out.println("t1의 우선순위는: "+t1.getPriority());
			Thread t2 = new Thread(t,"Thead2");
			System.out.println("t2의 우선순위는: "+t1.getPriority());
			
			Thread t3 = new Thread(t,"Thead3");
			t2.setPriority(10);
			System.out.println("t3의 우선순위는: "+t1.getPriority());
			t1.start();
			t2.start();
			t3.start();
			
	}

}
class Thread_2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("<"+Thread.currentThread().getName()+">");
		}
		for(int i=0;i<1000;i++) {
			
		}
	}}

