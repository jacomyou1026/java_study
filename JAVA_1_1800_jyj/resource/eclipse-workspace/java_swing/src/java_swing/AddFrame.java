package java_swing;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class Listener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JButton button = (JButton)e.getSource();//�̺�Ʈ �߻��� į����Ʈ
		 button.setText("��ư Ŭ��");//��ư ���ڿ� ������
		 
	}
	
}
public class AddFrame extends JFrame{
	AddFrame(){
		setTitle("JFrame");
		setSize(300,300);
		
		JButton button = new JButton("button"); 
		JCheckBox box = new JCheckBox("checkBox");
		JSlider slide=new JSlider(); 
		JTextField text = new JTextField("text �Է�",20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(text);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ư ������Ʈ�� �׼��̺�Ʈ ������ �ޱ�
		button.addActionListener(new Listener1());;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddFrame();
	}

}
