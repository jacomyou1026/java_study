package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO( Input, Output )
		//IO�� ����� ��Ʈ���� �ǹ��Ѵ�
		//��Ʈ���̶�, �����͸� ������ϱ� ���� ������ ���
		//JVM���� �ַܼ� ���� �������� Output, 
		//�ܼ��� ���� JVM���� �д� ���� Input
		
		String path = "C:/web1_pm_java/test.txt";
		File f1 = new File(path);
		
		if( !f1.isDirectory() ) {//f1.isFile()
			System.out.println("����ũ�� : " + f1.length() + "byte");
		}
		
	}//main
}














