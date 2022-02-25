package work2;

import java.util.Random;
import java.util.Scanner;

public class  rock_scissors_papper{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while( true ) {
			
			//0:가위, 1:바위, 2:보
			int com = new Random().nextInt(3);
			
			
			int userCount = 0;
			
			while(true) {
				System.out.print("가위(s) | 바위(r) | 보(p) : ");
				String user = sc.next();
				
				if( user.equals("s") ) {
					userCount = 0;
					break;
				}else if( user.equals("r") ) {
					userCount = 1;
					break;
				}else if( user.equals("p") ) {
					userCount = 2;
					break;
				}
			}
			
			switch(com) {
			case 0:
				System.out.println("컴퓨터가 가위를 냈습니다");
				break;
				
			case 1:
				System.out.println("컴퓨터가 바위를 냈습니다");
				break;
				
			case 2:
				System.out.println("컴퓨터가 보를 냈습니다");
				break;
			}
			
			//경수의 수
			if( userCount - com == 1 || userCount - com == -2 ) {
				System.out.println("이겼습니다");
				win++;
				
			}else if( userCount - com == 0 ) {
				System.out.println("비겼습니다");
				draw++;
				
			}else {
				System.out.println("졌습니다");
				lose++;
				
			}
			
			System.out.println(win + "승, " + draw + "무, " + lose + "패");
			
		}//while
		
	}//main
}





















































