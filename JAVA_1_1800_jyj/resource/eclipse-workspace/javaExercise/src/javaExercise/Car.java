package javaExercise;

public class Car {

	public static void main(String[] args) {
		Car2 mycar = new Car2();
		mycar.setGas(5);
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.��");
			mycar.run();
		}
		if(mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ�����ϴ�...");
		}else {
			System.out.println("gas�� �����ϼ���....");
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
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�(gas�ܷ�:" + gas + ")");
				return;
			}
		}
	}
}
