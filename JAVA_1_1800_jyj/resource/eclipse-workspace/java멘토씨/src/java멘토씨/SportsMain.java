package java���侾;

public class SportsMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member one = new Member();
		Member two= new Member();
		Member three = new Member();
		Member four= new Member();
		
		one.name="��ö��";
		one.name="���ȣ";
		one.name="�̿���";
		one.name="��õ";		
		
		one.age=32;
		two.age=28;
		three.age=24;
		four.age=32;

		one.gender="����"; 
		two.gender="����";
		three.gender="����";
		four.gender="����";
		
		Member.centerName="who";
		System.out.println("one1----------");
		one.info();
		System.out.println("one2----------");
		two.info();
		System.out.println("one3----------");
		three.info();
		System.out.println("one4----------");
		four.info();
	}

}
class Member{
	static String centerName;
	String name;
	int age;
	String gender;
	
	void info() {
		System.out.println("Center Name: "+centerName);
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
	}
}
