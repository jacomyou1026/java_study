package ex1_override;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 300);
		
		Button btn = new Button("버튼");
		f.add(btn);//프레임에 버튼을 추가
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("반가워요");
				
			}
		};
		
		btn.addActionListener(al);
		
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("안녕");				
//			}
//		});
		
		f.setVisible(true);//프레임을 시각화
		
	}//main
}














