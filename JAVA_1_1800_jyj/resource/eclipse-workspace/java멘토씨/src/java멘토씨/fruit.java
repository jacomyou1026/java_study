package java���侾;

import java.util.Scanner;

public class fruit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String fruits[] =new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("�ֹ��� ����:");
			fruits[i]=scan.next();
		}
		System.out.println("----�ֹ����� ����-----");
		for(String eachfruit:fruits) {
			System.out.print(eachfruit+" ");
		}
		
	}

}
