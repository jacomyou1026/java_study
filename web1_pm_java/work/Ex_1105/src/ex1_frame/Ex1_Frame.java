package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		//GUI : graphic user interface
		//����ڰ� ���ϴ� ������ ����� �˱⽱�� ������ ���� �׷��ȵ���
		//Ȱ���� �� �ֵ��� �����Ǵ� ���
		Frame frame = new Frame("ù ������ ������");
		
		frame.setSize(400, 300);//�ʺ�, ����
		frame.setLocation(500, 400);//x��ǥ, y��ǥ
		
		frame.setBackground( Color.BLUE );
		
		frame.setVisible(true);//������� �������� ȭ�鿡 ����
		
	}//main
}
















