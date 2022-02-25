package pack1.pack2;

public class Car {
String color; String size; Boolean enginState;
void showAtts() {
	System.out.println("this car is a"+color+" "+size+".");
	if(enginState ==true) {
		System.out.println("this engine is on");
	}else {
		System.out.println("the engine is off");
	}
}
void startEngine() {
	if(enginState == true) {
		System.out.println("The engine is already on \t");
	}
}
public static void main(String[] args) {

}
}

