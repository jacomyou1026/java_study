package java���侾;

import java.util.Calendar;

public class Date_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a= Calendar.getInstance();
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH)+1;//0���� ����
		int date = a.get(Calendar.DATE);
		
		System.out.println(year+"��"+month+"��"+date+"��");
		System.out.print("������ �̹��ֿ��� �� ���� ���ΰ���??");
		System.out.println(a.get(Calendar.DAY_OF_WEEK)-1);//�� �� ȭ 
		
		System.out.print("�̹� �⵵���� ������ �� ��° �ΰ�??");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.print("�̹� ���� ��ĥ���� �ִ°�??");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
