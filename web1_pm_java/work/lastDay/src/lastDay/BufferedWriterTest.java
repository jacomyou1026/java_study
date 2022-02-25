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
		
		bw.write("�ǻ�");
		bw.newLine();
		bw.write("�����\r\n");
		
		/*
		 *Java�� �ü���� ������ �°� �ڵ����� �ٹٲ� ���ڸ� �������ش�.
		 * ��, JAVA���� �ٹٲ��� �ν��ϴ� ���ڴ� "\n��"\r\n"���� �ΰ��� �̴�.
		 * ��������� �ؽ�Ʈ���Ϸκ��� �ؽ�Ʈ�� �ҷ��� �� ����Ű(�ٹٲ�)�� �����ڷ� ����Ϸ���
		 * "\r\n"���� �ؾ��Ѵ�.
		 */
		bw.write("����\r\n");
		bw.write("����\r\n");
		bw.close();
		
		String line="";
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
		
		
		
	}
}
