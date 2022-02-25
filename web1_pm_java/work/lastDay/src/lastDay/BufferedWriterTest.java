package lastDay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		bw.write("의사");
		bw.newLine();
		bw.write("집배원\r\n");
		
		/*
		 *Java는 운영체제의 종류에 맞게 자동으로 줄바꿈 문자를 변경해준다.
		 * 즉, JAVA에서 줄바꿈을 인식하는 문자는 "\n와"\r\n"으로 두가지 이다.
		 * 윈도우즈에서 텍스트파일로부터 텍스트를 불러올 때 엔터키(줄바꿈)을 구분자로 사용하려면
		 * "\r\n"으로 해야한다.
		 */
		bw.write("가수\r\n");
		bw.write("강사\r\n");
		bw.close();
		
		String line="";
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
		
		
		
	}
}
