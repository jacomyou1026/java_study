package ex4_choice;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EX1_Choice {
	static String res ="�Ͽ���";
	public static void main(String[] args) {
		Frame f = new Frame("Choice ���û���");
		f.setLayout(null); //�ڵ���ġ ����
		f.setBounds(500,300,300,100);
		
		Choice day = new Choice();
		//choice��ü ���̴� �ȿ� �ִ� ��� (��, ȭ, ��...)�� ������� �����ǹǷ�
		//0���� �����ص� �����ϴ�.
		
		day.setBounds(50,50,150,0);
		day.add("�Ͽ���");
		day.add("������");
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				res = day.getSelectedItem(); //�װ� �����ִ� �׸� �� �� ��
				System.out.println(res);
						
			}
		});
		
		f.add(day);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}
