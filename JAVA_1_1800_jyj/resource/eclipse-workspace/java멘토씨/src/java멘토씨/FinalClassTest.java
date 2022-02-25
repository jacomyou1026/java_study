package java¸àÅä¾¾;

public class FinalClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader =new Leader();
		leader.say();
		
	}

}
class Student_1{
	void learn() {
		System.out.println("¹è¿ì±â");
	}
	void eat() {
		System.out.println("¹ä¸Ô±â");
	}
	void say() {
		System.out.println("¼±»ı´Ô ¾È³çÇÏ¼¼¿ä!");
	}
}
class Leader extends Student_3{
	void lead() {
		
	}
	void say() {
		System.out.println("¼±»ı´Ô²² ÀÎ»ç");
		super.say();
	}
}