package ex4_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		String path = "C:\\web1_pm_java\\test.txt";
		
		try {
			FileReader fr = new FileReader(path);
			int code = 0;
			
			while( (code = fr.read()) != -1 ){
				
				System.out.print( (char)code );
				
			}
			
			fr.close();//사용이 완료된 스트림은 반드시 닫아주도록 하자
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}











