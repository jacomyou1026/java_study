package java_swing;

import java.awt.event.*;

import javax.swing.*;

class MenuActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "팝업");// 간단한 알림창
	}

}

public class MenuTest extends JFrame {
	MenuTest() {
		setTitle("Menu 만들기");
		createMenu();
		setSize(300, 300);
		setVisible(true);

	}

	public void createMenu() {
		// 메뉴바 생성
		JMenuBar mb = new JMenuBar();

		// 메뉴 생성
		JMenu screenMenu = new JMenu("메뉴바1");

		// 메뉴에 부착할 아이템생성
		screenMenu.add(new JMenuItem("load"));
		screenMenu.add(new JMenuItem("Hi"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator();// 구분선
		screenMenu.add(new JMenuItem("Exit"));

		// 메뉴바에 메뉴 부착
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));

		JMenuItem item = new JMenuItem("팝업");
		item.addActionListener(new MenuActionListener() {
			//익명 클래스
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "팝업");// 간단한 알림창
			}

		});
	
		screenMenu.add(item);
		mb.add(screenMenu);
		// 메뉴바를 현재 프레임의 메뉴로 지정
		setJMenuBar(mb);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuTest();
	}
}
