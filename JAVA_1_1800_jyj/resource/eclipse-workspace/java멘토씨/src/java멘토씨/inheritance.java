package java���侾;

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
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
	
}
class Student extends Person{
	void leran() {
		System.out.println("����");
	}
	
}
class Teacher extends Person{
	void teach() {
		System.out.println("����ġ��");
	}
}