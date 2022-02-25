package ex_work;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_work {
	public static void main(String[] args) {
		
		Frame frame= new Frame("외부프레임");
		frame.setBounds(500,400,500,400);
		
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				Frame f1 =new Frame("종료");
				f1.setBounds(500,400,400,300);
				
				Label la = new Label("종료??");
				la.setBounds(30,40,40,40);
				f1.add(la);
				f1.setLayout(null);
				Button b1 = new Button("종료");
				Button b2 = new Button("취소");
				
				b1.setBounds(70,90,100,50);
				b2.setBounds(230,90,100,50);
				
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						f1.dispose();
					}
				});
				f1.add(b1);
				f1.add(b2);
				
			}
		});
		
		
	}
}
