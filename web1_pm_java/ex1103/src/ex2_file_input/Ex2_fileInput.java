package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_fileInput {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\전유진\\Desktop\\자바\\web1_pm_java\\test.txt";
		File f1 =new File(path);
		
		byte[] b_read = new byte[(int)f1.length()];
		
		if(f1.exists()) {
			try {
				FileInputStream fis =new FileInputStream(f1);
				fis.read(b_read); // fis이 읽어온 데이터를 b_read배열에 순차적으로 1byte씩 저장
				
				//b_read를 result라는 문자열로 재조합
				String result = new String(b_read).trim();
				System.out.println(result);
				
				fis.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
