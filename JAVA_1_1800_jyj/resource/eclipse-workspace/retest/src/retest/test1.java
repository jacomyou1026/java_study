package retest;
import java.util.*;
public class test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("사칙연산기호와 두개의 숫자를 입력하시오");
		String str = sc.nextLine();
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		switch(str) {
		case "+":System.out.println(num1+num2);
		break;
		case "-":System.out.println(num1-num2);
		break;
		case "*":System.out.println(num1*num2);
		break;
		case "/":System.out.println(num1/num2);
		break;
		}
		
		
		
	}
	
	
}
