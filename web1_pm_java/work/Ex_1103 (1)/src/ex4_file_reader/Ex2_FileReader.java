package ex4_file_reader;

import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//file.txt를 읽어보고, 알파벳 대문자와 소문자 갯수를 각각 출력하시오
		
		//대문자 : 10
		//소문자 : 31
		String path = "C:\\web1_pm_java\\file.txt";
		
		try {
			
			FileReader fr = new FileReader(path);
			int code = 0;
			
			int upper = 0;//대문자
			int lower = 0;//소문자
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;			
				}
				
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//main
}













