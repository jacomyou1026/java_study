package java���侾;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Scanner1 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	    FileWriter fw = new FileWriter("sample.txt");
 	    // false�� ��� ������ �ʱ�ȭ�Ѵ��� ó������ ���
	    
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write("��� 1��");
	    bw.newLine();
	    bw.write("��� 2��");
	    
	    bw.close();
		
		
		}

}
