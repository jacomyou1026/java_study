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
		setTitle("mouse �̺�Ʈ â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Jp);//���۳�Ʈ ������ ���ִ� ��
		Jp.addMouseListener(new MouseListener1());
		Jp.addMouseMotionListener(new MouseListener1());
		la= new JLabel("���콺�� �÷�������");
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
			la.setText("���콺 Ŭ��Ƚ��: "+e.getClickCount());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("��");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.red);//���� ��� red�� ����
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.yellow);//���� 	
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		new Mouse();
	}

}
