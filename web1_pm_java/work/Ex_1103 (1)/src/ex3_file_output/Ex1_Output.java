package ex3_file_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		
		try {
			
			//PrintStream�� ȭ�鿡 �����͸� ����ϵ��� �ϴ� ��ǥ���� Ŭ����
			PrintStream ps = System.out;
			ps.write('A');
			ps.write('B');
			
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main
}










