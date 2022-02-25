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
		fos = new FileOutputStream("result.txt"); // 존재하지 않으면 생성, 존재하면 파일 덮어쓰기
			
		BufferedInputStream bis = new BufferedInputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data=bis.read())!=-1) {
			//data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐때까지
			bos.write(data);
		}
		bos.close();
		bis.close();
	}

}
