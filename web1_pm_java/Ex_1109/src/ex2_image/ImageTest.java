package ex2_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		
		Frame f= new Frame();
		f.setBounds(100,200,400,600);
		f.setLayout(null);
		
		//��ư���� ����� �̹��� ��������
		ImageIcon img2 = new ImageIcon("2.png");
		JButton btn = new JButton();
		btn.setIcon(img2);
		btn.setBounds(20,300,150,150);
		
		f.add(btn);
		
		//�̹��� ��������
		ImageIcon img = new ImageIcon("https://yaimg.yanolja.com/joy/sunny/static/images/my/img-my-profile-50.svg");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 400, 600);
		f.add(jl);
		
	
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
			};
		});
	}
}