package javaExercise;

public class Car {

	public static void main(String[] args) {
		Car2 mycar = new Car2();
		mycar.setGas(5);
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.↗");
			mycar.run();
		}
		if(mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요없습니다...");
		}else {
			System.out.println("gas를 주입하세요....");
		}

	}
}

class Car2 {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다(gas잔량:" + gas + ")");
				return;
			}
		}
	}
}
