package ex2_file_input;

import java.io.IOException;
import java.util.Scanner;

public class Ex3_InputStream {
	
	public static void main(String[] args) {
		
		System.out.print("�� : ");
		
		//Scanner sc = new Scanner(System.in);	
		//String res = sc.next();
		
		byte[] keyboard = new byte[100];
		
		try {
			//ǥ���Է���ġ(Ű����)�� ���� �о�������� ���
			System.in.read( keyboard );
			
			String str = new String(keyboard).trim();
			
			System.out.println(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
	
}









