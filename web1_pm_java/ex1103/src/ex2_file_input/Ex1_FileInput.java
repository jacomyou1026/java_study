package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) throws IOException {
		
		//..stream : ����Ʈ ����� ��Ʈ�����ν� 1byte�����θ� ���� �аų� �� �� �ִ�.
		//..Reader, .. Writer : ĳ���� ����� ��Ʈ�����ν� 2 byte������ ���� �аų� �� �� �ִ�.
		String path = "C:\\Users\\������\\Desktop\\�ڹ�\\web1_pm_java\\test.txt";
		File f = new File(path);
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				int code =0;
				while((code =fis.read())!=-1) {
					System.out.print((char)code);
				}
				//����� ��Ʈ���� ����� �Ϸ�� �� close�� ���� �ݵ�� �ݾ���� �Ѵ�.
				fis.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}