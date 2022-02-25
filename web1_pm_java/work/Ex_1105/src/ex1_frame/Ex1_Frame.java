package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		//GUI : graphic user interface
		//사용자가 원하는 형태의 모양을 알기쉽게 아이콘 등의 그래픽등을
		//활용할 수 있도록 제공되는 기능
		Frame frame = new Frame("첫 프레임 연습중");
		
		frame.setSize(400, 300);//너비, 높이
		frame.setLocation(500, 400);//x좌표, y좌표
		
		frame.setBackground( Color.BLUE );
		
		frame.setVisible(true);//만들어진 프레임을 화면에 노출
		
	}//main
}
















