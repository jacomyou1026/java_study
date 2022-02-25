package java���侾;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalPrace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDateTime new_ldt;

		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("������ ù ���� ��: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("������ ������ ��: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹� ���� ù ��° ��: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̹� ���� ù ��° ��: " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("�̹� ���� ù ��° ������:" + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("�̹� ���� ������ �Ͽ���:" + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("���ƿ��� �ݿ���" + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("������ ������ ���� �ݿ���:" + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("���� ������" + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("���� ������" + new_ldt);
	}
}
