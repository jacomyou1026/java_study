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
		//super : �θ�Ŭ����
		//parent();
		super(2);
		System.out.println("Child ������");
	}
	public String test() {
		return super.test();
	}
}
