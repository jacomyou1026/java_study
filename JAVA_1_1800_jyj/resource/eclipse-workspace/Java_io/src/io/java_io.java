package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class java_io {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("prac.txt");
		FileOutputStream fos =null;
		fos = new FileOutputStream("result.txt"); // �������� ������ ����, �����ϸ� ���� �����
			
		BufferedInputStream bis = new BufferedInputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data=bis.read())!=-1) {
			//data�� �о�� ����Ʈ�� �����ϴµ�, data�� ���� -1�� �ƴҶ�����
			bos.write(data);
		}
		bos.close();
		bis.close();
	}

}
