package ex3_file_output;

import java.io.PrintStream;

public class Ex1_output {
	public static void main(String[] args) {
		//printStream은 화면에 데이터를 출력하도록 하는 대표적인 클래스
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
