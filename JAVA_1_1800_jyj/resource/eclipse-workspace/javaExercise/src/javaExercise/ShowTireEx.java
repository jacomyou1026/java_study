package javaExercise;
class Tire_1{
	public void run() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");
	}
}
class SnowTire extends Tire_1{
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�.");
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
