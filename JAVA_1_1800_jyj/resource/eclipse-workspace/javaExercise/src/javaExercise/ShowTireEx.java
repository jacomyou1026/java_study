package javaExercise;
class Tire_1{
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
class SnowTire extends Tire_1{
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}

public class ShowTireEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snow = new SnowTire();
		Tire_1 tire = snow;
		snow.run();
		tire.run();
	}

}
