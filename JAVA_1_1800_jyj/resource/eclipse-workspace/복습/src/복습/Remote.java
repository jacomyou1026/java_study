package 복습;
interface RemoteControl{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMut(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
class Television implements RemoteControl{
	private int volum;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 끕니다.");
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
		System.out.println("현재 Tv의 볼륨은 "+this.volum);
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
