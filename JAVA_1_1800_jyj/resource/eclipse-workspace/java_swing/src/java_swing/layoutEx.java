package java_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class layoutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridWindow();
	}

}
class FlowWindow extends JFrame{
	FlowWindow(){
		setTitle("flow Window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.setLayout(new FlowLayout());
		setVisible(true);
	}
}
class BorderWindow extends JFrame{
	BorderWindow(){
		setTitle("Border Window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		JButton btn5= new JButton("btn5");
		JButton btn4= new JButton("btn4");
		
		this.setLayout(new BorderLayout());
		this.add(btn1,BorderLayout.EAST);
		this.add(btn2,BorderLayout.WEST);
		this.add(btn3,BorderLayout.SOUTH);
		this.add(btn4,BorderLayout.NORTH);
		this.add(btn5,BorderLayout.CENTER);
		//동서남북 지정
		
		
		setVisible(true);

	}
}
class GridWindow extends JFrame{
	GridWindow() {
		// TODO Auto-generated constructor stub
		setTitle("Grid Window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.setLayout(new GridLayout(4,2));
		
		
		setVisible(true);

		
	}
}