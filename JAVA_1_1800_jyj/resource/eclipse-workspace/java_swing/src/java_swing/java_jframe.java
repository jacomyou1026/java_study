package java_swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class java_jframe extends JFrame{
	java_jframe(){
		setTitle("JFrame");
		setSize(300,300);
		
		//������Ʈ �����
		JButton button = new JButton("button"); 
		JCheckBox box = new JCheckBox("checkBox");
		JSlider slide=new JSlider(); 
		JTextField text = new JTextField("text �Է�",20);
		
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(text);
		
		setVisible(true);
		//�� ���α׷� �ݴ� ����� �ݱ��ư���� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new java_jframe();
	}

}
