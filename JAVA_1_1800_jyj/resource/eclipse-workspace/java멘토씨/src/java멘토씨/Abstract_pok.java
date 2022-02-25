package java멘토씨;

public class Abstract_pok extends lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon_1 pokemon= new pika();
		System.out.println("이 포케몬은:"+pokemon.getNam());
		pokemon.attck();
		pokemon.sound();
		
		pokemon=new squirtle();
		System.out.println("이 포케몬은:"+pokemon.getNam());
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
		this.name="피카츄";
	}
	@Override
	void attck() {
		// TODO Auto-generated method stub
		System.out.println("전기공격");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("피카피카");
	}
	
}
class squirtle extends Pokemon_1{
	squirtle(){
		this.name="꼬부기";
	}
	@Override
	void attck() {
		// TODO Auto-generated method stub
		System.out.println("물 공격");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("꼬북 꼬불");
		
	}
	
}