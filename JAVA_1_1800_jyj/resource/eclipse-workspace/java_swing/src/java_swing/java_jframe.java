package java_swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class java_jframe extends JFrame{
	java_jframe(){
		setTitle("JFrame");
		setSize(300,300);
		
		//컴포넌트 만들기
		JButton button = new JButton("button"); 
		JCheckBox box = new JCheckBox("checkBox");
		JSlider slide=new JSlider(); 
		JTextField text = new JTextField("text 입력",20);
		
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(text);
		
		setVisible(true);
		//내 프로그램 닫는 기능을 닫기버튼으로 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new java_jframe();
	}

}
