package java멘토씨;

import java.util.Scanner;

public class breakMoeney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("현재 가진 돈을 입력하세요");
		int money=scan.nextInt();
		System.out.println("현재 가진돈은"+money+"입니다.");
		int i;
		while(true){
			System.out.println("얼마를 사용하겠습니까??");
			i=scan.nextInt();
			if(!(0<=i&&i<=money)) {
				System.out.println("다시 입력해주세여");
				continue;
			}
			System.out.printf("이제%d원 남았습니다.",money-=i);
			if(money==0) {
				System.out.println("이제 0원이 남았습니다.");
				System.out.println("모든 돈을 사용합니다. 종료");
				break;
			}
			
			
			
		}
		System.out.println("사용 종료");
	}

}
