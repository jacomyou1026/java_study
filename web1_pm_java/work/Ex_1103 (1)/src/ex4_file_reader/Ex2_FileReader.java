package ex4_file_reader;

import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//file.txt�� �о��, ���ĺ� �빮�ڿ� �ҹ��� ������ ���� ����Ͻÿ�
		
		//�빮�� : 10
		//�ҹ��� : 31
		String path = "C:\\web1_pm_java\\file.txt";
		
		try {
			
			FileReader fr = new FileReader(path);
			int code = 0;
			
			int upper = 0;//�빮��
			int lower = 0;//�ҹ���
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;			
				}
				
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : " + lower);
			
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//main
}













