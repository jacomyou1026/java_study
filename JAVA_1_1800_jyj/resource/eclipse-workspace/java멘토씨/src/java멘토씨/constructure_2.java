package java���侾;

public class constructure_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cclass c =new Cclass("������");
		Cclass c2=new Cclass("�ƴ�");
		System.out.println(c.name);
	}

}
class Cclass{
	String name;
	Cclass(String name2){
		System.out.println("Cclass�� �Ű����� ������()");
		this.name=name2;
	}
}
