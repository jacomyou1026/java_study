package ex1_buttonevent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ex1_button{
	public static void main(String[] args) {
		
		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(500, 400, 400, 300);
		
		//�������� �⺻ ��ġ�Ӽ��� �ڽİ�ü�� ȭ�鿡 ���� ä��� �ڵ���ġ ����� ���ش�
		f.setLayout(null);
		
		//�����ӿ� �߰��� ��ư ����
		Button btnOk = new Button("Ȯ��");
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(230, 90, 100, 50);
		
		f.add(btnOk);//�����ӿ� ��ư �߰�
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//�����ִ� ��� �������� ����
			};
		} );
		
	}//main
}