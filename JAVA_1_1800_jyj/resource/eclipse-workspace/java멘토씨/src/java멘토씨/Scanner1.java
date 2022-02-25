package java∏‡≈‰ææ;

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
 	    // false¿« ∞ÊøÏ ∆ƒ¿œ¿ª √ ±‚»≠«—¥Ÿ¿Ω √≥¿Ω∫Œ≈Õ ±‚∑œ
	    
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write("±Ëπ‰ 1¡Ÿ");
	    bw.newLine();
	    bw.write("±Ëπ‰ 2¡Ÿ");
	    
	    bw.close();
		
		
		}

}
