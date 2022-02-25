package work;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RandomMain {
	public static void main(String[] args) {
		String[] strArr = {"DOCTOR","APPLE","VIEW"};
		Scanner sc =new Scanner(System.in);
		int r = new Random().nextInt(3); 
	
		String name =strArr[r];
		int[] arr = new int[name.length()];
		
		String[] arrName = new String[name.length()];
		
		String a = "";
		
		for (int i = 0; i <arr.length; i++) {
			int ran = new Random().nextInt(name.length());
			arr[i] =ran;
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for (int i = 0; i < arrName.length; i++) {
			a+=name.charAt(arr[i]);
		}
		
		System.out.println("문제 : "+ a);
		
		while(true) {
			System.out.print("정답 : ");
			String n = sc.next().toUpperCase();
			
			if(name.equals(n)) {
				System.out.println("정답입니다.");
				break;
				
			}else {
				System.out.println(n+"은 오답....");
			}
		}
	}
}
