package java���侾;

import java.util.Calendar;
import java.util.Scanner;

public class Date_4 {

	public static void main(String[] args) { // TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���");
		int year =scan.nextInt();
		System.out.print("���� �Է��ϼ���");
		int month = scan.nextInt();
	}}

class CalendarPrint{
	Calendar cal = Calendar.getInstance();
	private String[] calHeader= {"��","��","ȭ","��","��","��","��"};
	private String[][] calDate=new String[6][7];
	private int width=calHeader.length;
	private int startDay;
	private int lastDay;
	private int inputDate =1;
	
	public CalendarPrint(int year,int month) throws Exception{
		if(month<1||month>12) {
			System.out.println(month+"���� 1~12 ������ �����Դϴ�.");
			throw new Exception();
		}else {
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month-1);
			cal.set(Calendar.DATE, 1);
			
			startDay=cal.get(Calendar.DAY_OF_WEEK);
			lastDay=cal.getActualMaximum(Calendar.DATE);
			
			int row=0;
			for(int i=1;1<=lastDay;i++) {//���� ������ ���������� ���� ����
				if(i<startDay) {
					calDate[row][i-1]="";
				}else {
					calDate[row][(i-1)%width]=Integer.toString(inputDate);
					inputDate++;
					
					
				}
			}
			
		}
	}
	
}
