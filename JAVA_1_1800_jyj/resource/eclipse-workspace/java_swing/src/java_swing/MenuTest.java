package java_swing;

import java.awt.event.*;

import javax.swing.*;

class MenuActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "�˾�");// ������ �˸�â
	}

}

public class MenuTest extends JFrame {
	MenuTest() {
		setTitle("Menu �����");
		createMenu();
		setSize(300, 300);
		setVisible(true);

	}

	public void createMenu() {
		// �޴��� ����
		JMenuBar mb = new JMenuBar();

		// �޴� ����
		JMenu screenMenu = new JMenu("�޴���1");

		// �޴��� ������ �����ۻ���
		screenMenu.add(new JMenuItem("load"));
		screenMenu.add(new JMenuItem("Hi"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator();// ���м�
		screenMenu.add(new JMenuItem("Exit"));

		// �޴��ٿ� �޴� ����
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));

		JMenuItem item = new JMenuItem("�˾�");
		item.addActionListener(new MenuActionListener() {
			//�͸� Ŭ����
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�˾�");// ������ �˸�â
			}

		});
	
		screenMenu.add(item);
		mb.add(screenMenu);
		// �޴��ٸ� ���� �������� �޴��� ����
		setJMenuBar(mb);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuTest();
	}
}
