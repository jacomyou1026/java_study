package ex5_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		String path = "C:\\web1_pm_java\\fileWriter����.txt";
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(path);
			fw.write( "���� fileWriter�� ������\n" );
			fw.write( "���ٵ� ���� ������");
			
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









