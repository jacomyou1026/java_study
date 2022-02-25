package java∏‡≈‰ææ;

public class constructure {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone myphone=new Cellphone();
		System.out.println(myphone.model);
	}

}
class Cellphone{
	String model="Galaxy_8";
	String color="red";
	int capacity=60;
	Cellphone(){
		System.out.println("model "+model);
		System.out.println("color :"+color);
		System.out.println("capacity :"+capacity);		
	}
	
	
}