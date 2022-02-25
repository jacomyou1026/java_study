package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) throws IOException {
		
		//..stream : 바이트 기반의 스트림으로써 1byte단위로만 값을 읽거나 쓸 수 있다.
		//..Reader, .. Writer : 캐릭터 기반의 스트림으로써 2 byte단위로 값을 읽거나 쓸 수 있다.
		String path = "C:\\Users\\전유진\\Desktop\\자바\\web1_pm_java\\test.txt";
		File f = new File(path);
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				int code =0;
				while((code =fis.read())!=-1) {
					System.out.print((char)code);
				}
				//사용한 스트림은 사용이 완료된 후 close를 통해 반드시 닫아줘야 한다.
				fis.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
