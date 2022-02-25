package java_실습;

import java.util.Scanner;

public class score {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		char grade;
		switch(score/10) {
		case 90:grade='A';
		case 80:grade='B';
		case 70:grade='C';
		case 60:grade='D';
		default:grade='F';
		}
		System.out.println("당신의 학점은"+grade+"입니다.");
	}

}
