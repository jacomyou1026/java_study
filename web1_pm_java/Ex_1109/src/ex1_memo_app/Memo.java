package ex1_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {
	public static void main(String[] args) {
		Frame frame = new Frame("���� �޸���");
		frame.setBounds(100, 300, 250, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		// frame.setResizable(false); //�������� ũ�⺯�� �Ұ�

		Font font = new Font("�ü�", Font.PLAIN, 20);
		// Ű������ ���� �Է¹ޱ� ���� Ŭ����
		TextField tf = new TextField();
		tf.setBounds(0, 0, 150, 15);
		Button btnOk = new Button();
		btnOk.setEnabled(false);// ��ư Ŭ�� ��Ȱ��ȭ
		btnOk.setBounds(165, 35, 0, 0);
		frame.add(btnOk);
		frame.add(tf);

//todo : �̺�Ʈ ó��		--------------	
//tf�� ���� ���մ� ��쿡�� �Է¹�ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().trim().equals("")) {
					btnOk.setEnabled(false);
				} else {
					btnOk.setEnabled(true);
				}
			}
		});

//--------------------

		// TextFieldó�� Ű���尪�� ���� �� ������. ���η� ���� ������ �����ϴ� Ŭ����
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false); // TextArea�� �ؽ�Ʈ�� ���� �Է¹��� ���ϰ� �ȴ�.
		frame.add(ta);
		Button btnSave = new Button("����");
		btnSave.setBounds(75, 340, 150, 30);

		frame.add(btnSave);
		//�Է¹�ư Ŭ���� tf���� ta�� �߰�
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//ta.setText(tf.getText());
			ta.append(tf.getText()+"\n");
			
			tf.setText("");
			
			tf.requestFocus(); //TextField�� Ŀ���� �̵�
			
			
			}
		});
		
		//���Ͱ� �Է� �� �Է¹�ư Ŭ������ ���� ���� ����� ������
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			if(e.getKeyChar() == KeyEvent.VK_ENTER){
				//ta.setText(tf.getText());
			ta.append(tf.getText()+"\n");
			
			tf.setText("");
			
			tf.requestFocus(); //TextField�� Ŀ���� �̵�
			
					
			}}
		});
		
		///�����ư Ŭ�� �̺�Ʈ ����
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextArea�� ��(����)
				String msg = ta.getText();
				try {
					FileDialog fd = new FileDialog(frame,"����",FileDialog.SAVE);
						fd.setVisible(true);
						
					//fd.getDirectory():������ ���� ���
					//fd.getFile() : ������ ���ϸ�
					
					String path =fd.getDirectory()+fd.getFile();
					
					//��ҹ�ư�� ������ ��
						FileWriter fw = new FileWriter(path);
						fw.write(msg);
						fw.close();
					
					if(fd.getFile()==null){
					JOptionPane.showMessageDialog(frame, "�������");
					}else{
						JOptionPane.showMessageDialog(frame, "�������");
					
					}
				} catch (Exception e1) {
				
				}	
								
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
			};
		});
	}
}