package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInputWork {
	public static void main(String[] args) {
		
		//C:\web1_pm_java\test.txt의 내용을 읽어들인 후
		//내용이 회문수인지 아닌지를 판단하시오!!
		String path = "C:\\web1_pm_java\\test.txt";
		File f = new File(path);
		byte[] by = new byte[(int)f.length()];
		
		String ori = "";//원본
		String rev = "";//뒤집어서 저장
		
		if( f.exists() ) {
			
			try {
				
				FileInputStream fis = new FileInputStream(f);
				fis.read(by);
				ori = new String(by).trim();
				
				//원본 ori를 뒤집어서 rev에 저장
				for( int i = ori.length()-1; i >= 0; i-- ) {
					rev += ori.charAt(i);
				}
				
				fis.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if( ori.equals(rev) ) {
				System.out.println("회문수");
			}else {
				System.out.println("안회문수");
			}
			
		}
		
	}//main
}









