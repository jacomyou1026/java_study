package pack1.pack2;

abstract class Shape{
	protected int x,y,width,height;
	public void  setX(int newX) {
		x = newX;
	}
	public void  setY(int newY) {
		x = newY;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public abstract float getArea();
}
class Rectangle extends Shape{
	@Override
	public float getArea() {
		return height * width;
	}

}
class Triangle extends Shape{
	public float getArea() {
		float triarea;
		triarea = (height*width)/2;
		return triarea; 
	}
}
public class ShapeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		r.setWidth(5);
		r.setHeight(10);
		System.out.println(r.getArea());
	}

}
