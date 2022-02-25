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
	static String res ="일요일";
	public static void main(String[] args) {
		Frame f = new Frame("Choice 선택상자");
		f.setLayout(null); //자동배치 끄기
		f.setBounds(500,300,300,100);
		
		Choice day = new Choice();
		//choice객체 높이는 안에 있는 요소 (월, 화, 수...)의 사이즈로 결정되므로
		//0으로 세팅해도 무방하다.
		
		day.setBounds(50,50,150,0);
		day.add("일요일");
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				res = day.getSelectedItem(); //네가 갖고있는 항목 중 고른 것
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
