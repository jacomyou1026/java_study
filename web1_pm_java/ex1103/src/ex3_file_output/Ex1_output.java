package ex3_file_output;

import java.io.PrintStream;

public class Ex1_output {
	public static void main(String[] args) {
		//printStream�� ȭ�鿡 �����͸� ����ϵ��� �ϴ� ��ǥ���� Ŭ����
		try {
			PrintStream ps = System.out;
			ps.write('A');
			ps.write('b');
			ps.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
