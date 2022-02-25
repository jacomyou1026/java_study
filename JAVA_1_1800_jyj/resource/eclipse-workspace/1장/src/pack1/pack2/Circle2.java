package pack1.pack2;
public class Circle2 extends Point {
	int radius;
	Circle2(){
		x=5;y=5;radius=5;
	}
	public void setRadius(int r) {
		radius = r;  
	}
	public String showCircle() {
		return "Center = "+"("+x+","+y+")"+"Radius ="+radius;}
	public int area() {
		int a;
		a=(int)(radius*radius*3.14);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 MyCircle = new Circle2();
		MyCircle.setPoint(10, 32);
		MyCircle.setRadius(34);
		System.out.println(MyCircle.getX());
		System.out.println(MyCircle.getX());
		
		
}}
