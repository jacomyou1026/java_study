package java���侾;

public class interface_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	B b=new B();
	b.method1();
	b.method2();
	Ainter a = new Ainter(){

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			System.out.println("����.");
		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			System.out.println("1334");
			
		}
	
	
	};
	a.method1();
	a.method2();
	
	

}
interface Ainter{
	//final ���� ����
	final int x=20;
	int y=23;;
	
	abstract void method1();
	void method2(); // abstract ��������
}
class B implements Ainter{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
	System.out.println("methodA");	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}
	
}}