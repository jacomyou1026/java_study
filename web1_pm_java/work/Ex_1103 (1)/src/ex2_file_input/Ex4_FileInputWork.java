package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInputWork {
	public static void main(String[] args) {
		
		//C:\web1_pm_java\test.txt�� ������ �о���� ��
		//������ ȸ�������� �ƴ����� �Ǵ��Ͻÿ�!!
		String path = "C:\\web1_pm_java\\test.txt";
		File f = new File(path);
		byte[] by = new byte[(int)f.length()];
		
		String ori = "";//����
		String rev = "";//����� ����
		
		if( f.exists() ) {
			
			try {
				
				FileInputStream fis = new FileInputStream(f);
				fis.read(by);
				ori = new String(by).trim();
				
				//���� ori�� ����� rev�� ����
				for( int i = ori.length()-1; i >= 0; i-- ) {
					rev += ori.charAt(i);
				}
				
				fis.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if( ori.equals(rev) ) {
				System.out.println("ȸ����");
			}else {
				System.out.println("��ȸ����");
			}
			
		}
		
	}//main
}









