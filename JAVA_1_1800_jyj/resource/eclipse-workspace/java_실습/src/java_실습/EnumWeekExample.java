package java_�ǽ�;

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
		System.out.println("���� ����: "+today);
		
		if(today==Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౹�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� �����սô�.");
		}
	}

}
