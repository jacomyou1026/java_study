package ex2_file_input;

import java.io.IOException;
import java.util.Scanner;

public class Ex3_InputStream {
	public static void main(String[] args) {
		
		System.out.print("�� : ");
		byte[] keyboard =new byte[100];
		//ǥ���Է���ġ(Ű����)�� ���� �о�������� ���
		try {
			System.in.read(keyboard);
			
			String str=new String(keyboard).trim();
			
			System.out.println(str);
			
			System.in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
