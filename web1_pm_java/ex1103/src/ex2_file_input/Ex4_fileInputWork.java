package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4_fileInputWork {
	public static void main(String[] args) throws IOException {
	//������ �о���� ��
	//������ ȸ�������� �ƴ��� �Ǵ�.
	String path = "C:\\Users\\������\\Desktop\\�ڹ�\\web1_pm_java\\test.txt";
	File f1 =new File(path);
	byte[] keyboard = new byte[(int)f1.length()];
	String result ="";
	String rev ="";
	if(f1.exists()) {
		try {
			FileInputStream fis = new FileInputStream(f1);
			fis.read(keyboard);
			result = new String(keyboard).trim();
			fis.close();
			
			//���� result�� ����� rev�� ����
			for (int i = result.length()-1; i >=0 ; i--) {
				rev += result.charAt(i);
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result.equals(rev)) {
			System.out.println("0");
			
		}else {
			System.out.println("x");
			
		}
	}
	if(f1.exists()) {
		FileInputStream fis = new FileInputStream(f1);
		fis.read();
		
		
	}

	}
}
