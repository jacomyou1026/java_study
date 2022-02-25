package ex1_computer;



public class ComMain {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		
		//private 접근제한자를 사용한 변수는 타 클래스에서 접근이 불가
		//c1.company = "samsung";
		c1.myPc();
		
		Computer c2 = new Computer();
		c2.ssd = 400;
		c2.myPc();
		
		
		
	}//main
}














