package ex4_window_listener;

import java.awt.event.WindowEvent;

public class XClickListener extends ListenerChild{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x버튼 눌렀음");
		System.exit(0);
	}
	
}
