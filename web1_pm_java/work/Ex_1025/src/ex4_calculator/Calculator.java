package ex4_calculator;

public class Calculator {
	
	public void getResult( int n1, int n2, String op ) {
		
		switch(op) {
		
		case "+":
			System.out.println("결과 : " + (n1 + n2));
			break;
		
		case "-":
			System.out.println("결과 : " + (n1 - n2));
			break;
			
		case "*":
			System.out.println("결과 : " + (n1 * n2));
			break;
			
		}//switch
		
	}
	
}






