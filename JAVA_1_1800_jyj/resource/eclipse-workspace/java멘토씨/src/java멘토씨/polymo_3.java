package java¸àÅä¾¾;

public class polymo_3 {

	public static void main(String[] args) {
 
		Animal_4 lion1 =new Lion();
		Animal_4 rabbit =new Rabbit();
		Animal_4 mon =new Monkey();
		
		Zookeeper james=new Zookeeper();
		james.feed(lion1);
		james.feed(rabbit);
		james.feed(mon);
	}
}
class Animal_4{
	void breath() {
		System.out.println("¼û½¬±â");
	}
	
}
class Lion extends Animal_4{
	public String toString() {
		return "»çÀÚ";
	}
}
class Rabbit extends Animal_4{
	public String toString() {
		return "Åä³¢";
	}
}
class Monkey extends Animal_4{
	public String toString() {
		return "¿ø¼şÀÌ";
	}
}
class Zookeeper {
	void feed(Animal_4 animal) {
		System.out.println(animal+"¿¡°Ô ¸ÔÀÌÁÖ±â");
	}
}
