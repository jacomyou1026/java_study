package ex3_file_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_fileOutput {
	public static void main(String[] args) throws IOException {
		String path= "C:\\Users\\전유진\\Desktop\\자바\\web1_pm_java\\fileOutput예제.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			String msg1= "fileoutput예제임";
			String msg2 = "두줄도 됨";
			
			fos.write(msg1.getBytes());
			fos.write('\n');
			fos.write(msg2.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
