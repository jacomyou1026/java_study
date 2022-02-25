package java∏‡≈‰ææ;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world";
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("ll"));
		System.out.println(str.equals("Hello world"));
		
		//trim()
		System.out.println("  test   ".trim());
		System.out.println("Hello world".replace('l', 'L'));
		System.out.println("Hello world".replaceAll("Hello", "bye"));
	}

}
