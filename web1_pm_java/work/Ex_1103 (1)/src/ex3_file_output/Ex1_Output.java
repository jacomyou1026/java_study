package ex3_file_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		
		try {
			
			//PrintStream은 화면에 데이터를 출력하도록 하는 대표적인 클래스
			PrintStream ps = System.out;
			ps.write('A');
			ps.write('B');
			
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main
}










