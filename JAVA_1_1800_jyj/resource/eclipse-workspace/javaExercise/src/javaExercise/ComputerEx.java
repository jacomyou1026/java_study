package javaExercise;
class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCirelce()����");
		return 3.14*r*r;
	}
}
class Computer extends Calculator{
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()����");
		return Math.PI*r*r;
	}
}
public class ComputerEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		Calculator cal = new Calculator();
		System.out.println("�� ����: "+cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("������:"+com.areaCircle(r));
	}

}
