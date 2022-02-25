package pack1.pack2;

public class MotorCar {
	protected int velocity =100;
	protected int wheelNum;
	protected String carName;
	public void speedUp() {
		velocity = velocity+1;
		System.out.println("Motorcar클래스의 메소드");
	}
	public void speedUp(int velocity) {
		this.velocity+=velocity;
		System.out.println("(int vel) ");
	}
	public void speedDown() {
		velocity = velocity-10;
		if(velocity<0) velocity=0;
	}
	public void stop() {
		velocity=0;
	}
	
}
