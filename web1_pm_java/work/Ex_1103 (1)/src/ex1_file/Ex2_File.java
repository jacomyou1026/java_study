package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/web1_pm_java";
		File f1 = new File(path);
		
		if( f1.isDirectory() ) {//!f1.isFile()
			
			String[] names = f1.list();//f1객체가 접근한 파일명을 names배열에 저장
			
			for( int i = 0; i < names.length; i++ ) {
				
				System.out.println( names[i] );
				
			}
			
		}
		
	}//main
}



























