package ex3_check_box;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Check_radioMain2 {
	static boolean female= false;
	static boolean male=false;
	public static void main(String[] args) {
		Frame f = new Frame("üũ�ڽ��� ������ư");
		f.setBounds(500,400,800,500);
		f.setLayout(null);
		
		//��Ʈ ����
		Font font = new Font("�ü�ü",Font.BOLD,30);
		//Font.ITALIC : ���ڸ� ��￩�� �������
		//font .plain : �β��Ե�, ��������� ���� �⺻ ��Ʈ
		//				�۲� 	�۲üӼ�	��Ʈ ũ��
		Label q1 =new Label("����� ������ �����Դϱ�");
		q1.setFont(font);
		q1.setBounds(10,25,380,50);
		
		//������ư ����
		CheckboxGroup group = new CheckboxGroup();
		//�̸� ���� ���� ��, false 
		Checkbox c1 = new Checkbox("����",group,false);
		Checkbox c2 = new Checkbox("����",group,false);
		
		c1.setBounds(10,80,100,50);
		c1.setFont(font);
		c2.setBounds(10,140,150,50);
		c2.setFont(font);
		f.add(c1);
		f.add(c2);
		
		Label result1= new Label();
		result1.setBackground(Color.blue);
		result1.setBounds(350,80,400,100);

		
		//üũ�ڽ��� �̺�Ʈ ������ ����
		ItemListener it= new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				switch(e.getItem().toString()) {
				case "����":
					
				if(e.getStateChange()==1) {
					female = true;
					System.out.println("���� ����");
				}else {
					female =false;
				}
				
				break;
				case "����":
					if(e.getStateChange()==1) {
						male =true;	
						System.out.println("���� ����");
					}else {
						male =false;
					}
					break;
				
				}
			}
		};
		//üũ�ڽ��� �̺�Ʈ ������ ���
		c1.addItemListener(it);
		c2.addItemListener(it);
		
		//q1.setBackground(Color.green);
		f.add(q1);//frame�� label �߰�
		
		f.setVisible(true);
		f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//�����ִ� ��� �������� ����
			};
		} );
		
	}
}
