package java���侾;

public class interface_2method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide = new TourGuide();
		guide.leisureSports(); 
		guide.sightseeing(); 
		guide.food(); 
	}

}
interface Prividable{
	void leisureSports();
	void sightseeing();
	void food();
}
class koreaTour implements Prividable{

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("���忡�� ����Ű ����");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("�溹�� ���� ����");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("���� ����� ����");
		
	}
	
}
class JapanTour implements Prividable{

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("����Ÿ�� �������� ����");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("����ī ���� ����");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("�ҹ� ����");
	}
	
}

class TourGuide{
	private Prividable tour = new JapanTour();
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		// TODO Auto-generated method stub
		tour.sightseeing();
	}

	
	public void food() {
		// TODO Auto-generated method stub
		tour.food();
	}
	
}
