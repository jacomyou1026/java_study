package java_�ǽ�;

import java.util.Scanner;

public class Array_avg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		Scanner scan =new Scanner(System.in);
		int sum=0;
		System.out.println(intArray.length+"���� ������ �Է��Ͻÿ�>>");
		for(int i=0;i<intArray.length;i++) {
			intArray[i]= scan.nextInt();
			sum+=intArray[i];
		}
		System.out.println("���:"+(double)sum/intArray.length);
		scan.close();
	}

}
