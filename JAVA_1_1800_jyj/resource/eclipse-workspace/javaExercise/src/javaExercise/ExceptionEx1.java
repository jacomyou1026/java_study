package javaExercise;

public class ExceptionEx1 {
	int left,right;
	public void setOprands (int left, int right) {
		this.left =left;
		this.right =right;		
	}
	public void divide() {
		try {
			
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print("입니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		catch( Exception e) {
		System.out.println("틀립니다."+e.getMessage());	
		}
		finally {
			System.out.println("누구세여");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx1 e = new ExceptionEx1();
		e.setOprands(12, 0);
		e.divide();
	}

}
