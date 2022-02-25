package ex6_exit;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {

		Frame f1 = new Frame();
		f1.setBounds(500, 400, 400, 300);
		f1.setVisible(true);

		Frame f2 = new Frame();
		f2.setBounds(500, 400, 400, 300);
		f2.setBackground(Color.BLUE);
		f2.setVisible(true);

		f1.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//�����ִ� ��� �������� ����
			};
		} );

		f2.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				f2.dispose();//f2�����Ӹ� �ܵ����� ����
			};
		} );

	}//main
}
