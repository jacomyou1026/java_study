package ex5_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		 outer : while(true){
			
			System.out.print("�� : ");
			String id = sc.next();
			
			for( int i = 0; i < arr.size(); i++ ) {
				
				if( arr.get(i).equals(id) ) {
					System.out.println("�ߺ��� ���̵�");
					continue outer;
				}
				
			}//for			
			
//			if( arr.contains(id) ) {
//				System.out.println("�ߺ��� ���̵�");
//				continue outer;
//			}
			
			arr.add(id);
			
			System.out.println(arr);			
		}
		
	}//main
}












