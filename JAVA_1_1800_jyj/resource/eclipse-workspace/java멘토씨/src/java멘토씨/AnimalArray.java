package java���侾;

public class AnimalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal an[] = new animal[3];
		for(int i=0;i<an.length;i++) {
			an[i]=new animal();
		}
		an[0].kind="�����";
		an[1].kind="������";
		an[2].kind="�����";
		
		an[0].age=1;
		an[1].age=2;
		an[2].age=3;
		
		an[0].name="����";
		an[1].name="����";
		an[2].name="����";
		
		for(int i=0;i<an.length;i++) {
			System.out.println(i+1+"�ݷ�����----");
			an[i].info();
		}
	}

}
class animal{
	String kind;
	String name;
	int age;
	void info() {
		System.out.println("kind :"+kind);
		System.out.println("name :"+name);
		System.out.println("age:"+age);
	}
}
