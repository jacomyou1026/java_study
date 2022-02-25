package java멘토씨;

import java.util.Calendar;

public class Date_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a= Calendar.getInstance();
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH)+1;//0부터 시작
		int date = a.get(Calendar.DATE);
		
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.print("오늘은 이번주에서 몇 번쨰 일인가요??");
		System.out.println(a.get(Calendar.DAY_OF_WEEK)-1);//일 월 화 
		
		System.out.print("이번 년도에서 오늘이 몇 일째 인가??");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.print("이번 달은 며칠까지 있는가??");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
