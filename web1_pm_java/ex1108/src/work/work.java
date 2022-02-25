package work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class work {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(150,120,230,300);
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {

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
				
				f1.add(b1);
				f1.add(b2);
				ActionListener al = new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String  s= e.getActionCommand();
						switch(s) {
						case "종료":
							System.exit(0);
							System.out.println("정ㄹ");
							break;
							
						case "취소":
							f1.dispose();
							System.out.println("취소");
							break;
						}
						
					}
				}; 
				b1.addActionListener(al);
				b2.addActionListener(al);
				f1.setVisible(true);
				
			};
		} );
		

		
	}
}
