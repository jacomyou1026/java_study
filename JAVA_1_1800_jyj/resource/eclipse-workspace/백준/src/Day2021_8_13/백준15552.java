package Day2021_8_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ????15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String[] temp = br.readLine().split(" ");
				bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
