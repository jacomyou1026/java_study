package ex4_super;

public class Child extends Parent {
	int num;
	public void mySet(int num) {
		this.num = num;
	}
	public void setEye(int eye) {
		super.eye=eye;
	}
	public Child() {
		//super : 부모클래스
		//parent();
		super(2);
		System.out.println("Child 생성자");
	}
	public String test() {
		return super.test();
	}
}
