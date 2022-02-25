public class AnimalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal[]=new Animal[3];
		for(int i=0;i<animal.length;i++) {			
			animal[i]=new Animal(); 
		}
		
		animal[0].kind="하이";
		animal[1].kind="2";
		animal[2].kind="3";
		
		animal[0].name="3";
		animal[1].name="ㅇㄹ";
		animal[2].name="ㅇㅎ";
		
		animal[0].age=1;
		animal[1].age=3;
		animal[2].age=1;
		
		for(int i=0;i<animal.length;i++) {
			animal[i].info();
			System.out.println();
		}
	}

}
class Animal{
	String kind;
	String name;
	int age;
	void info() {
		System.out.println("kind: "+kind); 
		System.out.println("name: "+name); 
		System.out.println("age: "+age); 
	}
}