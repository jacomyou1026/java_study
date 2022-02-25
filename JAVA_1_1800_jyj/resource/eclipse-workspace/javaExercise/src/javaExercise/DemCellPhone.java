package javaExercise;
class CellPhone{
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기:"+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}

public class DemCellPhone extends CellPhone {
	int channel;

	DemCellPhone(String model,String color,int channel) {
		// TODO Auto-generated constructor stub
		this.model=model;
		this.color=color;
		this.channel=channel;	}
	
	void turnOnDmb() {
		System.out.println("채절 "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채절"+channel+"번으로 바꿉니다.");
	}
	void turnoffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemCellPhone deb = new DemCellPhone("자바폰","검정",10);
		System.out.println("모델 :"+deb.model);
		System.out.println("색상 :"+deb.color);
		
		System.out.println("채널: "+deb.channel);
		
		deb.powerOn();
		deb.bell();
		deb.sendVoice("여보세요");
		deb.receiveVoice("안녕하세요! 저는 홍길동인데요");
		deb.sendVoice("아! 예 반갑습니다.!");
		deb.hangup();
		
		deb.turnOnDmb();
		deb.changeChannelDmb(12);
		deb.turnoffDmb();
	}	

}
