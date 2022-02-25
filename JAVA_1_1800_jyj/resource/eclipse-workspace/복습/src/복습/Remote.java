package ����;
interface RemoteControl{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMut(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
class Television implements RemoteControl{
	private int volum;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volum>RemoteControl.MAX_VOLUME) {
			this.volum=RemoteControl.MAX_VOLUME;
		}else if(volum<RemoteControl.MIN_VOLUME) {
			this.volum=RemoteControl.MIN_VOLUME;
		}else {
			this.volum=volume;
		}
		System.out.println("���� Tv�� ������ "+this.volum);
	}

	
}

public class Remote {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}

}
