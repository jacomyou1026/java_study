package java���侾;
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
		
		System.out.println("���� 6�� �Է��ض�: ");
		for(int i=0;i<userAr.length;i++) {
			userAr[i]= scan.nextInt();
		}
		System.out.println("���ʽ� �� �Է�: ");
		bonusUser = scan.nextInt();
		System.out.println("User:"+Arrays.toString(userAr)+"bonus : "+bonusUser);
	
		//�ζǹ迭�� ���� ����� �迭�� ���� ���� ��� ���� ī����
		for(int i=0;i<lottoar.length;i++) {
			for(int j=0;j<userAr.length;j++) {
			if(lottoar[i]==userAr[i]) {
				count++;
			}
		}
			
	}
		System.out.println("�� ���� ����: "+count);
		switch(count) {
		case 6 :
			System.out.println("�����մϴ�.!! 1��");
			break;
		case 5: 
			if(bonus==bonusUser) {
				System.out.println("�����մϴ�.!!2��");
			}else {
				System.out.println("�����մϴ�.!! 3��");
			}
		case 4:
			System.out.println("�����մϴ�.!! 4��");
		case 3:
			switch(count) {
			case 6 :
				System.out.println("�����մϴ�.!! 1��");
				break;
			case 5: 
				if(bonus==bonusUser) {
					System.out.println("�����մϴ�.!!2��");
					break;
				}else {
					System.out.println("�����մϴ�.!! 3��");
					break;
				}
			case 4:
				System.out.println("�����մϴ�.!! 4��");
				break;
			case 3:
				System.out.println("�����մϴ�.!! 5��");
				break;				
			default:System.out.println("���� ��ȸ��..."); 
			}


		}

	}

}
