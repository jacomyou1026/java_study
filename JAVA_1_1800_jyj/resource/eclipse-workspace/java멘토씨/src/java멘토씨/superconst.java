package java∏‡≈‰ææ;

public class superconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar mycar = new SportCar("red",32);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
		
	}

}
class Car_1{
	int wheel;
	int speed;
	String color;
	Car_1(String color){
		this.color= color;
	}
}
class SportCar extends Car_1{
	int speedLimit;
	SportCar(String color, int speedLimit){
		super(color);
		this.color=color;
		this.speedLimit=speedLimit;
	}
}