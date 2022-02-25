package ex5_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("홍대", "02-111-1111");
		Bank b2 = new Bank("이대", "02-222-2222");
		Bank b3 = new Bank("서강", "02-333-3333");
		
		//스테틱 변수는 클래스명. 을 통해서 직접적으로 접근이 가능
		//스테틱 변수는 객체생성 없이 원할 때 언제든 사용이 가능
		Bank.interest = 0.1f;
		
		b1.bankInfo();
		b2.bankInfo();
		b3.bankInfo();
		
	}//main
}
