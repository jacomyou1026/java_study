package java멘토씨;

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
		System.out.println("현장에서 수상스키 투여");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("경복궁 관람 투여");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("전주 비빔밥 투여");
		
	}
	
}
class JapanTour implements Prividable{

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("도쿄타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("오사카 관림 투어");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("소밥 투어");
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
