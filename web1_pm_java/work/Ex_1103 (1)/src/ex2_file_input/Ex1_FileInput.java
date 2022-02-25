package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		//...Stream : 바이트 기반의 스트림으로써 1byte단위로만 값을 읽거나 쓸 수 있다.
		//...Reader, ...Writer : 캐릭터 기반의 스트림으로써 2byte단위로 값을 읽거나 쓸 수 있다.
	
		String path = "C:/web1_pm_java/test.txt";
		File f = new File(path);
		
		if( f.exists() ) {
			
			//파일클래스와 연결된 입력스트림 생성
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				//스트림은 더이상 읽을것이 없다면 -1을 반환하도록 되어 있다.
				//-1을 읽어왔다는 이야기는 결국 EOF(End of File)까지 접근했음을 명시
				while( (code = fis.read()) != -1) {
					
					System.out.print( (char)code );
					
				}//while
				
				//사용한 스트림은 사용이 완료된 후 close를 통해 반드시 닫아줘야 한다
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}//main
}




























