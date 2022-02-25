package java_swing;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class Listener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JButton button = (JButton)e.getSource();//이벤트 발생한 캄포넌트
		 button.setText("버튼 클릭");//버튼 문자열 재지정
		 
	}
	
}
public class AddFrame extends JFrame{
	AddFrame(){
		setTitle("JFrame");
		setSize(300,300);
		
		JButton button = new JButton("button"); 
		JCheckBox box = new JCheckBox("checkBox");
		JSlider slide=new JSlider(); 
		JTextField text = new JTextField("text 입력",20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(text);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 컴포넌트에 액션이벤트 리스너 달기
		button.addActionListener(new Listener1());;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddFrame();
	}

}
