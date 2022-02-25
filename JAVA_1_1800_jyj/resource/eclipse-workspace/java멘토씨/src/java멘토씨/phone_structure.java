package java∏‡≈‰ææ;

public class phone_structure {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone myphone1 = new Iphone();
		Iphone myphone2 = new Iphone("i_phone_S2","Red",40);
		System.out.println(myphone1.capacity);
		System.out.println(myphone2.capacity);
		myphone2.info();
	}

}
class Iphone{
	String model;
	String color;
	int capacity;
	Iphone(){}
	Iphone(String model, String color, int capacity){
		this.model=model;
		this.capacity=capacity;
		this.color=color;
	}
	void info() {
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("capacity:"+capacity);
	}
}