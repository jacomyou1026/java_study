package ex1_file;

import java.io.File;

public class Ex1_file {
	public static void main(String[] args) {
		//IO(input,output)
		//io는 입출력 스트림을 의미한다.
		//스트림이란, 데이터를 입출력하기 위한 일종의 통로
		//JVM에서 콘솔로 값을 내보내면 output, 
		//콘솔의 값을 JVM에서 읽는 경우는 iput.
		
		String path = "C:\\Users\\전유진\\Desktop\\자바\\web1_pm_java//test.txt";
		File f1 = new File(path);
		if(!f1.isDirectory()) {//f1.isFile()
			System.out.println("file size : "+f1.length()+"byte");
		}
		
	}
}
