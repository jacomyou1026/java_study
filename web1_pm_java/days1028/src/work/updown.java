package work;

import java.util.Random;
import java.util.Scanner;

public class updown {
	static boolean ischeck;
	int count = 1;
		public boolean game(int result) {
			ischeck =false;
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			String r = "";
			if(answer>result) {
					count++;
					r= "Down";
				}else if(answer<result){
					count++;
					r= "up";
				}else if(answer==result){
					r= count+"���� ����";
					ischeck =true; 
				}
			System.out.println(r);
			return ischeck;
			}

	}
