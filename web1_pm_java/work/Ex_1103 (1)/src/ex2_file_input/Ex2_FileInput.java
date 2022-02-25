package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = "C:/web1_pm_java/test.txt";
		//String path = "C:\\web1_pm_java\\work\\Ex_1022\\src\\ex1_string_method\\Ex1_StringMethod.java";
		File f1 = new File(path);
		
		byte[] b_read = new byte[ (int)f1.length() ];
		
		if( f1.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f1);
				
				fis.read(b_read);//fis�� �о�� �����͸� b_read�迭�� ���������� 1byte�� ����
				
				//b_read�� result��� ���ڿ��� ������
				String result = new String( b_read ).trim();
				
				System.out.println(result);
				
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}















