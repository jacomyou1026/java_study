package java멘토씨;

import java.util.Random;

public class Rock { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		System.out.println("☆☆☆☆☆☆☆가위바위보 대잔치 ☆☆☆☆☆☆☆");
		
		System.out.println("1.주먹 2.가위 3.보");
		System.out.println("선택해 주세요");
		int person1 = ran.nextInt(3)+1;
		int person2 = ran.nextInt(3)+1;
		System.out.println("person1은 "+person1);
		System.out.println("person2은 "+person2);
		if(person1==person2) {		
				System.out.println("비겼습니다. 다시해주세요");
			}
		if(person1==1) {
			if(person2==2) {
				System.out.println("person1이 이겼습니다. 주먹>가위");
			}
			else if(person2==3) {
				System.out.println("person2가 이겼습니다. 주먹<보");
			}
		}
		
		
			
	
	}

}
