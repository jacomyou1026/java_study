package java���侾;

public class Annoymous3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter1 it = new Inter1() {

			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("inter1 imple f1()");
			}
			
		};
		it.f1();
	}

}
interface Inter1{
	void f1();
}
class InterImple implements Inter1{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
	}
	
}
