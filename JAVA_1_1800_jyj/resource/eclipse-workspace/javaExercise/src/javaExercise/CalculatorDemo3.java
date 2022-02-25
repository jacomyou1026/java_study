package javaExercise;

class Calculator3 {
	 int left, right;
	 public void setOprands(int left,int right) {
		 this.left=left;
		 this.right=right;
	 }
	 public void divide() {
		 if(right==0) {
			 throw new ArithmeticException("0으로 나눌 수 없습니다.");
		 }

		 try {
			 System.out.print("계산결과는 ");
			 System.out.print(this.left/this.right);
			 System.out.print("입니다.");
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("getMessage()"+e.getMessage());
		}
	 }
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		Calculator3 c1  =new Calculator3();
		c1.setOprands(10, 0);
		try {
			c1.divide();			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} 
	}
}