package java���侾;

public class upcasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_3 st1=new Student_3("���浿",20,"����",3);
		st1.info();
		st1.study();
		
		Human h1=new Student_3("���浿", 30, "���ϱ�", 3);
		h1.info();
		
	}

}
class Human{
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
		
	}
}
class Student_3 extends Human{
	int grade;
	public Student_3(String name, int age, String hobby,int grade) {
		super(name, age, hobby);
		this.grade=grade;
	}
	void info() {
		super.info();
		System.out.println("grade:"+grade);
	}
	void study() {
		System.out.println("�����ϱ�");
	}
}