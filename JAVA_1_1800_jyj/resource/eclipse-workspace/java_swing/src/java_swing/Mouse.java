package java_swing;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventObject;

import javax.swing.*;

public class Mouse extends JFrame{	
	JPanel Jp = new JPanel();
	JLabel la;
	Mouse(){
		setTitle("mouse 이벤트 창");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Jp);//컨퍼넌트 부착할 수있는 것
		Jp.addMouseListener(new MouseListener1());
		Jp.addMouseMotionListener(new MouseListener1());
		la= new JLabel("마우스를 올려보세요");
		Jp.add(la);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	class MouseListener1 implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouse dagged("+e.getX()+","+e.getY());
			}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouse Moveed("+e.getX()+","+e.getY());

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("마우스 클릭횟수: "+e.getClickCount());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("뗌");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.red);//판의 배경 red로 설정
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.yellow);//판의 	
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		new Mouse();
	}

}
