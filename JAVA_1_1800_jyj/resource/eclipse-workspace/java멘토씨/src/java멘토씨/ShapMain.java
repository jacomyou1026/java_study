package java멘토씨;

public class ShapMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shap shapes[] =new Shap[3];
		shapes[0]=new Rect();
		shapes[1]=new Circle();
		shapes[2]=new line();
	
		for(int i=0;i<3;i++) {
			shapes[i].draw();
		}
	}

}
abstract class Shap{
	abstract void draw() ;
	
}
class Rect extends Shap{
	void draw() {
		System.out.println("사각형을 그리다.");
	}
}
class Circle extends Shap{
	void draw() {
		System.out.println("원을 그리다.");
	}
}
class line extends Shap{
	void draw() {
		System.out.println("선을 그리다.");
	}
}
