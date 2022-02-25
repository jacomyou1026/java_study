package javaExercise;
class CellPhone{
	String model;
	String color;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ�:"+message);
	}
	void receiveVoice(String message) {
		System.out.println("����: "+message);
	}
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
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
		System.out.println("ä�� "+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnoffDmb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemCellPhone deb = new DemCellPhone("�ڹ���","����",10);
		System.out.println("�� :"+deb.model);
		System.out.println("���� :"+deb.color);
		
		System.out.println("ä��: "+deb.channel);
		
		deb.powerOn();
		deb.bell();
		deb.sendVoice("��������");
		deb.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		deb.sendVoice("��! �� �ݰ����ϴ�.!");
		deb.hangup();
		
		deb.turnOnDmb();
		deb.changeChannelDmb(12);
		deb.turnoffDmb();
	}	

}
