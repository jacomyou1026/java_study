package lastDay;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class BoxOffice extends JFrame implements ActionListener{
	TextArea box = new TextArea(BoxOfficeView.getContexts());
	TextArea search = new TextArea("검색 :Ctrl, 삭제: 버튼 클릭");
	public BoxOffice() {
		JScrollPane scroll =new JScrollPane();
		JButton btn =new JButton("삭제");
		setTitle("박스오피스");
		setBounds(1000,50,600,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.setFont(new Font("D2Coding",Font.BOLD,40));
		btn.addActionListener(this);
		
		box.setEditable(false);
		scroll.setViewportView(box);
		getContentPane().add(scroll);
		add(search,BorderLayout.NORTH);
		add(btn,BorderLayout.SOUTH);
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_CONTROL:
					filmSearch();
					break;
				case KeyEvent.VK_ALT:
					search.setText("검색 :Ctrl, 삭제: 버튼 클릭");
				}
			}
		});
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "삭제":
			try {
				fileDelete();
				box.setText(BoxOfficeView.getContexts());
				//revalidate(); -새로고침
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	void filmSearch() {
		String[] con =new String[600];
		String[] arcon = new String[2000];
		con = BoxOfficeView.getContexts().split("\n");
		String keyword =search.getText();
		String result ="";
		for (int i = 0; i < con.length; i++) {
			arcon=con[i].split("\t");
			if(arcon[1].contains(keyword)) {
				result+=con[i];
				result +="\r\n";
			}
		}
		search.setText(result);
	}
	void fileDelete() throws IOException{
		FileReader fr = new FileReader(new File("boxOffice.txt"));
		BufferedReader br =new BufferedReader(fr);
		
		String line ="";
		String temp ="";
		while((line=br.readLine())!=null) {
			if(!line.contains(search.getText())) {
				temp +=line+"\r\n";
			}
		}
	FileWriter fw = new FileWriter("boxOffice.txt");
	fw.write(temp);
	fw.close();
	br.close();
	BoxOfficeView.setContexts(temp);
	}
}
