package java멘토씨;
import java.util.*;
public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] lottoar =new int[6];
		int[] userAr =new int[6];
		int bonus;
		int bonusUser;
		int count=0;
		for(int i=0;i<lottoar.length;i++) {			
			lottoar[i] = ran.nextInt(45)+1;
		}
		bonus=ran.nextInt(45)+1;
		System.out.println("Lotto:"+Arrays.toString(lottoar)+"bonus : "+bonus);
		
		System.out.println("숫자 6개 입력해라: ");
		for(int i=0;i<userAr.length;i++) {
			userAr[i]= scan.nextInt();
		}
		System.out.println("보너스 값 입력: ");
		bonusUser = scan.nextInt();
		System.out.println("User:"+Arrays.toString(userAr)+"bonus : "+bonusUser);
	
		//로또배열의 값과 사용자 배열의 값중 같은 몇개의 인지 카운팅
		for(int i=0;i<lottoar.length;i++) {
			for(int j=0;j<userAr.length;j++) {
			if(lottoar[i]==userAr[i]) {
				count++;
			}
		}
			
	}
		System.out.println("총 맞춘 갯수: "+count);
		switch(count) {
		case 6 :
			System.out.println("축하합니다.!! 1등");
			break;
		case 5: 
			if(bonus==bonusUser) {
				System.out.println("축하합니다.!!2등");
			}else {
				System.out.println("축하합니다.!! 3등");
			}
		case 4:
			System.out.println("축하합니다.!! 4등");
		case 3:
			switch(count) {
			case 6 :
				System.out.println("축하합니다.!! 1등");
				break;
			case 5: 
				if(bonus==bonusUser) {
					System.out.println("축하합니다.!!2등");
					break;
				}else {
					System.out.println("축하합니다.!! 3등");
					break;
				}
			case 4:
				System.out.println("축하합니다.!! 4등");
				break;
			case 3:
				System.out.println("축하합니다.!! 5등");
				break;				
			default:System.out.println("다음 기회에..."); 
			}


		}

	}

}
