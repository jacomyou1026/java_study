package java∏‡≈‰ææ;

public class innerclass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class A{
	static class StaticInner{
		
	}
	class InstanceInner{
		
	}
	
	StaticInner st1 = new StaticInner();
	InstanceInner ii1= new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
	}
	void InstanceMethod() {		
		StaticInner st3 = new StaticInner();
		InstanceInner ii2= new InstanceInner();
	}
}