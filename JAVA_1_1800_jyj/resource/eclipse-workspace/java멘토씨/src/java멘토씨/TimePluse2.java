package java멘토씨;

import java.time.LocalDateTime;

public class TimePluse2 {
	public static void main(String[] args) {
		LocalDateTime id =LocalDateTime.now();
		System.out.println("현재시간:"+id);
		LocalDateTime id2=id.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("현재 시간:"+id2);
		LocalDateTime id3=id2.minusHours(24);
		System.out.println("자동 변환 시간:"+id3);
		
	}
}
