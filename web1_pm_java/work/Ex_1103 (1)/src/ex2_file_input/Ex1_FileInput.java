package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		//...Stream : ����Ʈ ����� ��Ʈ�����ν� 1byte�����θ� ���� �аų� �� �� �ִ�.
		//...Reader, ...Writer : ĳ���� ����� ��Ʈ�����ν� 2byte������ ���� �аų� �� �� �ִ�.
	
		String path = "C:/web1_pm_java/test.txt";
		File f = new File(path);
		
		if( f.exists() ) {
			
			//����Ŭ������ ����� �Է½�Ʈ�� ����
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				//��Ʈ���� ���̻� �������� ���ٸ� -1�� ��ȯ�ϵ��� �Ǿ� �ִ�.
				//-1�� �о�Դٴ� �̾߱�� �ᱹ EOF(End of File)���� ���������� ���
				while( (code = fis.read()) != -1) {
					
					System.out.print( (char)code );
					
				}//while
				
				//����� ��Ʈ���� ����� �Ϸ�� �� close�� ���� �ݵ�� �ݾ���� �Ѵ�
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}//main
}




























