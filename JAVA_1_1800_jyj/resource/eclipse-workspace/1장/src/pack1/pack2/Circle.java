package pack1.pack2;

import java.util.StringTokenizer;

public class Circle extends Point{
	int radius;
	Circle(){
		x=5;y=5;
		radius=5;
	}
	Circle(int a, int b, int c){
		x=a;
		y=b;
		radius=c;
	}
	public int getRadius() {
		return radius;
	}
	private void setRadius(int r) {
		radius =r;
	}
	public String showCircle() {
		return "("+x+","+y+")"+","+radius;
	}
	public static void main(String[] args) {
		Circle my = new Circle();
		my.setPoint(10, 23);
		my.setRadius(40);
		System.out.println(my.getX());
		System.out.println(my.getY());
		System.out.println(my.getRadius());
		System.out.println(my.showCircle());
	}
}
