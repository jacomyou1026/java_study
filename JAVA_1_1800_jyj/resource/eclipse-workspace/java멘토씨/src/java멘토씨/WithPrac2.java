package java∏‡≈‰ææ;

import java.time.LocalTime;

public class WithPrac2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		LocalTime new_time=lt.withHour(3).withMinute(25).withSecond(24).withNano(3333);
		System.out.println(new_time);
	}

}
