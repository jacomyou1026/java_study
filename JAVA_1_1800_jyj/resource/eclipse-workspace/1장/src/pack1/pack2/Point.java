package pack1.pack2;

public class Point {
	int x,y;
	Point(){
		x=0;y=0;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public  void setPoint(int a, int b) {
		x=a;
		y=b;
	}
	public String showPoint() {
		return x+","+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point mypoint = new Point();
		System.out.println(mypoint.getX());
		System.out.println(mypoint.getY());
		System.out.println(mypoint.showPoint());
		
		Point yourpoint = new Point();
		yourpoint.setPoint(12, 23);
		System.out.println(yourpoint.getX());
		System.out.println(yourpoint.getY());
		System.out.println(yourpoint.showPoint());
	}

}
