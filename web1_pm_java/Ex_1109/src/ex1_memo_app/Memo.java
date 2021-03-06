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
		Frame frame = new Frame("간단 메모장");
		frame.setBounds(100, 300, 250, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		// frame.setResizable(false); //프레임의 크기변경 불가

		Font font = new Font("궁서", Font.PLAIN, 20);
		// 키보드의 값을 입력받기 위한 클래스
		TextField tf = new TextField();
		tf.setBounds(0, 0, 150, 15);
		Button btnOk = new Button();
		btnOk.setEnabled(false);// 버튼 클릭 비활성화
		btnOk.setBounds(165, 35, 0, 0);
		frame.add(btnOk);
		frame.add(tf);

//todo : 이벤트 처리		--------------	
//tf에 값이 들어가잇는 경우에만 입력버튼 활성화
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

		// TextField처럼 키보드값을 받을 수 있으나. 세로로 넓은 영역을 포함하는 클래스
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false); // TextArea에 텍스트를 직접 입력받지 못하게 된다.
		frame.add(ta);
		Button btnSave = new Button("저장");
		btnSave.setBounds(75, 340, 150, 30);

		frame.add(btnSave);
		//입력버튼 클릭시 tf값을 ta에 추가
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//ta.setText(tf.getText());
			ta.append(tf.getText()+"\n");
			
			tf.setText("");
			
			tf.requestFocus(); //TextField로 커서가 이동
			
			
			}
		});
		
		//엔터값 입력 시 입력버튼 클릭했을 때와 같은 결과를 만들자
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			if(e.getKeyChar() == KeyEvent.VK_ENTER){
				//ta.setText(tf.getText());
			ta.append(tf.getText()+"\n");
			
			tf.setText("");
			
			tf.requestFocus(); //TextField로 커서가 이동
			
					
			}}
		});
		
		///저장버튼 클릭 이벤트 감지
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextArea의 값(내용)
				String msg = ta.getText();
				try {
					FileDialog fd = new FileDialog(frame,"저장",FileDialog.SAVE);
						fd.setVisible(true);
						
					//fd.getDirectory():저장할 폴더 경로
					//fd.getFile() : 저장할 파일명
					
					String path =fd.getDirectory()+fd.getFile();
					
					//취소버튼을 눌렀을 떄
						FileWriter fw = new FileWriter(path);
						fw.write(msg);
						fw.close();
					
					if(fd.getFile()==null){
					JOptionPane.showMessageDialog(frame, "저장취소");
					}else{
						JOptionPane.showMessageDialog(frame, "저장취소");
					
					}
				} catch (Exception e1) {
				
				}	
								
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
			};
		});
	}
}
