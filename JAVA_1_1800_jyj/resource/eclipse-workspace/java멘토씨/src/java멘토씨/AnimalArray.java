package java멘토씨;

public class AnimalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal an[] = new animal[3];
		for(int i=0;i<an.length;i++) {
			an[i]=new animal();
		}
		an[0].kind="고양이";
		an[1].kind="강아지";
		an[2].kind="고양이";
		
		an[0].age=1;
		an[1].age=2;
		an[2].age=3;
		
		an[0].name="나르";
		an[1].name="초코";
		an[2].name="나코";
		
		for(int i=0;i<an.length;i++) {
			System.out.println(i+1+"반려동물----");
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
