package ex1_buttonevent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ex1_button{
	public static void main(String[] args) {
		
		Frame f = new Frame("버튼 테스트");
		f.setBounds(500, 400, 400, 300);
		
		//프레임의 기본 배치속성인 자식객체를 화면에 가득 채우는 자동배치 기능을 꺼준다
		f.setLayout(null);
		
		//프레임에 추가할 버튼 생성
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(230, 90, 100, 50);
		
		f.add(btnOk);//프레임에 버튼 추가
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//열려있는 모든 프레임을 종료
			};
		} );
		
	}//main
}
