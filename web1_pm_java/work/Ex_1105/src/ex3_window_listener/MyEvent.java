package ex3_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEvent implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("x��ư�� Ŭ����");
		System.exit(0);//�����ִ� ��� �������� ����
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ ��ư ����");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("����ũ��� ���ƿ�");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
