package ex1_file;

import java.io.File;

public class Ex1_file {
	public static void main(String[] args) {
		//IO(input,output)
		//io�� ����� ��Ʈ���� �ǹ��Ѵ�.
		//��Ʈ���̶�, �����͸� ������ϱ� ���� ������ ���
		//JVM���� �ַܼ� ���� �������� output, 
		//�ܼ��� ���� JVM���� �д� ���� iput.
		
		String path = "C:\\Users\\������\\Desktop\\�ڹ�\\web1_pm_java//test.txt";
		File f1 = new File(path);
		if(!f1.isDirectory()) {//f1.isFile()
			System.out.println("file size : "+f1.length()+"byte");
		}
		
	}
}
