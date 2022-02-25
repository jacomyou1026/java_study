package java∏‡≈‰ææ;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="test";
		StringBuffer buffer = new StringBuffer("test");
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1,3 , "ES");
		System.out.println(buffer);
	}

}
