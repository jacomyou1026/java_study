package java멘토씨;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		User use[]=new User[3];
		for(int i=0;i<use.length;i++) {
			use[i]=new User();
		}
		for(int i=0;i<use.length;i++) {
			System.out.print("name:");
			use[i].name=scan.next();
			System.out.print("phone:");
			use[i].phone=scan.next();
			System.out.print("age:");
			use[i].age=scan.nextInt();
			System.out.print("gender:");
			use[i].gender=scan.next();
		}
		for(int i=0;i<use.length;i++) {
			System.out.println("["+(i+1)+"번째 사용자 정보 ]");
			use[i].info();
		}
		
	}

}
class User{
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("-----------info-----------");
		System.out.println("name :"+name);
		System.out.println("phone :"+phone);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
	}
}