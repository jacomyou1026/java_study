package ex4_window_listener;

import java.awt.event.WindowEvent;

public class XClickListener extends ListenerChild{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x��ư ������");
		System.exit(0);
	}
	
}
