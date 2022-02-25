package ex5_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		String path = "C:\\web1_pm_java\\fileWriter예제.txt";
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(path);
			fw.write( "나는 fileWriter의 예제임\n" );
			fw.write( "두줄도 쓸수 있지렁");
			
			//fw.flush();
			//fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}









