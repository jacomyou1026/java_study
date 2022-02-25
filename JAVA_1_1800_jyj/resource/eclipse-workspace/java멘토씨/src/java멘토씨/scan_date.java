package java멘토씨;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;

public class scan_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println("today is "+c.getTime());
		
		Scanner scan =new Scanner(System.in);
		System.out.println("year: ");
		String year=scan.next();
		System.out.println("month: ");
		String month=scan.next();
		c.set(Calendar.YEAR, Integer.valueOf(year));
		c.set(Calendar.MONTH, Integer.valueOf(month)-1);
		
		int datOfweek = c.get(Calendar.DAY_OF_WEEK);
		c.set(Calendar.DAY_OF_MONTH, 32);
		int lastday = 32-c.get(Calendar.DAY_OF_MONTH);
		
		int i=0;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(;i<dayOfweek-1;i++) {
			System.out.println("\t");
		}
		
		Calendar today= Calendar.getInstance();
		Calendar endOfyear= Calendar.getInstance();
		
		
		endOfyear.set(Calendar.MONTH,11);
		endOfyear.set(Calendar.DATE,31);
		log diff= 
		
		
	}

}
