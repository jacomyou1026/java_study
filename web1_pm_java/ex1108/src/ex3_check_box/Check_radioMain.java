package ex3_check_box;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Check_radioMain {
	static boolean book = false;
	static boolean movie =false;
	public static void main(String[] args) {
		Frame f = new Frame("체크박스와 라디오버튼");
		f.setBounds(500,400,800,500);
		f.setLayout(null);
		
		//폰트 설정
		Font font = new Font("궁서체",Font.BOLD,30);
		//Font.ITALIC : 글자를 기울여서 만들어줌
		//font .plain : 두껍게도, 기울이지도 않은 기본 폰트
		//				글꼴 	글꼴속성	폰트 크기
		Label q1 =new Label("당신의 취미는 무엇입니까");
		q1.setFont(font);
		q1.setBounds(10,25,380,50);
		
		//체크박스 생성
		Checkbox c1 = new Checkbox("독서");
		Checkbox c2 = new Checkbox("영화감상");
		Checkbox c3 = new Checkbox("게임");
		
		c1.setBounds(10,80,100,50);
		c1.setFont(font);
		c2.setBounds(10,140,150,50);
		c2.setFont(font);
		c3.setBounds(10,200,100,50);
		c3.setFont(font);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		
		Label result1= new Label();
		result1.setBackground(Color.blue);
		result1.setBounds(350,80,400,100);

		
		//체크박스용 이벤트 감지자 생성
		ItemListener it= new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//선택한 체크박스의 내용
				String sel = e.getItem().toString();
				switch(sel) {
				//선택된 체크박스는 1. 취소된 체크박스 2
				case "독서":
					if(e.getStateChange() == 1) {
						book = true;
					}else {
						book = false;
					}
					break;
				case "영화감상":
					if(e.getStateChange() == 1) {
						result1.setText("영화감상");
					}else {
						result1.setText("");
					}

					break;
				case "게임":
					if(e.getStateChange() == 1) {
						result1.setText("게임");
					}else {
						result1.setText("");
					}

					break;
				}
			}
		};
		//체크박스에 이벤트 감자자 등록
		c1.addItemListener(it);
		c2.addItemListener(it);
		c3.addItemListener(it);
		
		f.add(result1);
		//q1.setBackground(Color.green);
		f.add(q1);//frame에 label 추가
		
		f.setVisible(true);
		f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//열려있는 모든 프레임을 종료
			};
		} );
		
	}
}
