package java_실습;

import java.util.Calendar;
import java.util.Random;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=null;
		Random ran = new Random();
		int week = ran.nextInt(6)+1;
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WEDSDAY;
			break;
		case 5:
			today=Week.THURDAY;
			break;
		case 6:
			today=Week.SATUDAY;
			break;
		
		}
		System.out.println("오늘 요일: "+today);
		
		if(today==Week.SUNDAY) {
			System.out.println("일용일에는 축국를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합시다.");
		}
	}

}
