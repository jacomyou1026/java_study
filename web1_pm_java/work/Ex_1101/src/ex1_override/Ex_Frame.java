package ex1_override;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 300);
		
		Button btn = new Button("��ư");
		f.add(btn);//�����ӿ� ��ư�� �߰�
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ݰ�����");
				
			}
		};
		
		btn.addActionListener(al);
		
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�ȳ�");				
//			}
//		});
		
		f.setVisible(true);//�������� �ð�ȭ
		
	}//main
}














