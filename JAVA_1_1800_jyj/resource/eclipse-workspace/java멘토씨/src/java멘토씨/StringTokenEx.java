package java∏‡≈‰ææ;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kim:010-2323-3232";
		String delim = ":";
		StringTokenizer st = new StringTokenizer(str,delim);
		String[] array=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
