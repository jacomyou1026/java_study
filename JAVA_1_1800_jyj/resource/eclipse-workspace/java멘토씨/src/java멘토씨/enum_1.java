package java∏‡≈‰ææ;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH= new Fruit();
	public static final Fruit BANANA = new Fruit();
}
*/

enum Fruit{
	PEACH("pink"), BANANA("yellow"), APPLE("red");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color){//
		System.out.println("call constructor "+this);
		this.color=color;
	}
}
enum Company{
	GOOGLE,APPLE,BANANA;
}

/*
 * class Company{ public static final Company GOOGLE= new Company(); public
 * static final Company APPLE= new Company(); public static final Company
 * ORACLE= new Company(); }
 */


public class enum_1 {
	public static void main(String[] args) {

		/*Fruit type = Fruit.APPLE; 
		switch(type) {
		case APPLE:
			System.out.println(57+"kcal, color:"+Fruit.APPLE.getColor());
			break;
			
		case BANANA:
			System.out.println(23+"kcal, color:"+Fruit.APPLE.BANANA.getColor());
			break;
			
		case PEACH:
			System.out.println(35+"kcal, color:"+Fruit.PEACH.getColor());
			break;*/
		
			
		for(Fruit f: Fruit.values()) {
			System.out.println(f+" : "+f.getColor());
		}
		System.out.println("---------------------------------");
		for(Company c: Company.values()) {
			System.out.println(c);
		}
	}

}
