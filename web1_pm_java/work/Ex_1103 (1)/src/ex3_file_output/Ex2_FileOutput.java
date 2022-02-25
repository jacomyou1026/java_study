package ex3_file_output;

import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		String path = "C:\\web1_pm_java\\fileOutput예제.txt";
		
		try {
			
			FileOutputStream fos = new FileOutputStream(path);
			
			String msg1 = "fileOutput예제임";
			String msg2 = "두줄도 됨";
			
			//String타입의 객체를 byte[] 형식으로 바꿔주는 getBytes()메서드
			fos.write(msg1.getBytes());
			fos.write('\n');
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main
}













