package javaExercise;
class Airplane{
	public void land() {
		System.out.println("착륙합니다.");
	}
	public void fly() {
		System.out.println("일반비행기입니다.");
	}
	public void takeoff() {
		System.out.println("이륙합니다.");
	}
}
class SuperAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC= 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode ==SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		}else {
			super.fly();
		}
	}
	
}

public class AirplaneEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAirplane sa = new SuperAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode=SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
