package java멘토씨;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class timmer1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer(true);
		TimerTask w1 = new Work1();
		TimerTask w2 = new Work2();
		t.schedule(w1, 3000);
		t.schedule(w2, 1000);
		Thread.sleep(4000);
		System.out.println("모든작업 종료!!");
		
	}

}
class Work1 extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("work1 실행");
	}
	
}
class Work2 extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("work2 실행!");
	}
	
}