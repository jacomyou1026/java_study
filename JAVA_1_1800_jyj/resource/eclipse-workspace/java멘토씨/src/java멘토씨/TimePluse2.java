package java���侾;

import java.time.LocalDateTime;

public class TimePluse2 {
	public static void main(String[] args) {
		LocalDateTime id =LocalDateTime.now();
		System.out.println("����ð�:"+id);
		LocalDateTime id2=id.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("���� �ð�:"+id2);
		LocalDateTime id3=id2.minusHours(24);
		System.out.println("�ڵ� ��ȯ �ð�:"+id3);
		
	}
}
