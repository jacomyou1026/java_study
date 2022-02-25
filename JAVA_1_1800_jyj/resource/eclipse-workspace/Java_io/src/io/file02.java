package io;

import java.io.*;

public class file02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		
		try {
			fr=new FileReader("prac1.txt");
			fw =new FileWriter("Mentoc.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String line; 
			while((line=br.readLine())!=null) {
				bw.write(line);
			}
			bw.close();
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
