package ex3_window_listener;

import java.awt.Color;
import java.awt.Frame;import java.util.EventListener;

public class EventMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("�̺�Ʈ ������");
		f.setBackground( Color.YELLOW );
		
		//f.setSize(400, 300);
		//f.setLocation(500, 400);
		f.setBounds(400, 300, 500, 400);//�ʺ�, ����, x��ǥ, y��ǥ
		
		//f�� �̺�Ʈ ������ ���
		f.addWindowListener(new MyEvent());
		
		f.setVisible(true);
	}//main
}




















