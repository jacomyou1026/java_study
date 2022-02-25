package java¸àÅä¾¾;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.breath();
		stu.leran();
		System.out.println();
		Teacher t= new Teacher();
		t.eat();
		t.teach();
		
		
	}

}
class Person{
	void breath() {
		System.out.println("¼û½¬±â");
	}
	void eat() {
		System.out.println("¹ä¸Ô±â");
	}
	void say() {
		System.out.println("¸»ÇÏ±â");
	}
	
}
class Student extends Person{
	void leran() {
		System.out.println("¹è¿ì±â");
	}
	
}
class Teacher extends Person{
	void teach() {
		System.out.println("°¡¸£Ä¡±â");
	}
}