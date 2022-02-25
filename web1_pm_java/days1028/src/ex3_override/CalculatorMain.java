package ex3_override;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		Pluse p = new Pluse();
		int pl= p.getResult(num1, num2);
		System.out.println("더하기 : "+pl);
		Minus min = new Minus();
		int m = min.getResult(num1, num2);
		System.out.println("빼기 : "+m);
		Multi mul =new Multi();
		int mu = mul.getResult(num1, num2);
		System.out.println("나누기 : "+mu);
	}
}
