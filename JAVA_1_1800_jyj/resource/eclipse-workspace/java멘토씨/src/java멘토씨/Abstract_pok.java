package java���侾;

public class Abstract_pok extends lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon_1 pokemon= new pika();
		System.out.println("�� ���ɸ���:"+pokemon.getNam());
		pokemon.attck();
		pokemon.sound();
		
		pokemon=new squirtle();
		System.out.println("�� ���ɸ���:"+pokemon.getNam());
		pokemon.attck();
		pokemon.sound();
		
	}

}
abstract class Pokemon_1{
	String name;
	abstract void attck();
	abstract void sound();
	public String getNam() {
		return this.name;
	}
}
class pika extends Pokemon_1{
	pika(){
		this.name="��ī��";
	}
	@Override
	void attck() {
		// TODO Auto-generated method stub
		System.out.println("�������");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("��ī��ī");
	}
	
}
class squirtle extends Pokemon_1{
	squirtle(){
		this.name="���α�";
	}
	@Override
	void attck() {
		// TODO Auto-generated method stub
		System.out.println("�� ����");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
		
	}
	
}