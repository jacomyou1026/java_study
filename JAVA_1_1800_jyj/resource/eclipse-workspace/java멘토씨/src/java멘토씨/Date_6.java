package java멘토씨;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date day = new Date();
		String patternKorea = "yyyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-MM-yyyy";
		String pattern1 = "E요일 HH시 mm분 ss초";
		
		SimpleDateFormat p1 =new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 =new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3 =new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 =new SimpleDateFormat(pattern1);
		
		System.out.println("현재 날짜:"+day);
		System.out.println("한국형식(년,월,일):"+p1.format(day));
		System.out.println("미국(월,일,년):"+p2.format(day));
		System.out.println("영국형식(일,월,년):"+p3.format(day));
		System.out.println("pattern1:"+p4.format(day));
		
	}

}
