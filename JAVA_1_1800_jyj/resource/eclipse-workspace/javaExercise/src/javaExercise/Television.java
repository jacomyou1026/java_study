package javaExercise;
class Telev{
	static String company = "Samsoung";
	static String model = "LCD";
	static String info;
	
	static {
		info=company+"-"+model;
	}
}

public class Television {
	public static void main(String[] args) {
		System.out.println(Telev.info);
	}
}
