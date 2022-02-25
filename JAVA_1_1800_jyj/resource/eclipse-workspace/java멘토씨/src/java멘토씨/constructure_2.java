package java멘토씨;

public class constructure_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cclass c =new Cclass("전유진");
		Cclass c2=new Cclass("아니");
		System.out.println(c.name);
	}

}
class Cclass{
	String name;
	Cclass(String name2){
		System.out.println("Cclass의 매개변수 생성자()");
		this.name=name2;
	}
}
