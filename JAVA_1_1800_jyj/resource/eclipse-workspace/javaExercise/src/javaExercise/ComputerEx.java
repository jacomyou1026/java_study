package javaExercise;
class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCirelce()실행");
		return 3.14*r*r;
	}
}
class Computer extends Calculator{
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}
public class ComputerEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		Calculator cal = new Calculator();
		System.out.println("원 면적: "+cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원면적:"+com.areaCircle(r));
	}

}
