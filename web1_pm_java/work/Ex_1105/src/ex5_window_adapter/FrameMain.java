package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Scanner;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("¾î´ðÅÍ È°¿ë");
		
		f.setBounds(500, 300, 400, 300);
		
//		WindowAdapter wa = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		};		
//		f.addWindowListener(wa);
		
		f.addWindowListener( new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		
		f.setVisible(true);
		
	}//main
}













