package ex2_constructor;

public class Note {
	
	private int page;
	private String brand;
	private int price;
	
	//Note n1 = new Note();
	public Note() {
		//생성자 : 객체가 생성될 때 메모리 할당을 위해 호출되는 메서드개념의 영역
		//생성자는 객체당 딱 한번만 호출할 수 있다.
		//1)생성자는 반환형이 없다
		//2)클래스 이름과 대소문자 까지 완전히 동일해야 한다 
		page = 50;
		brand = "바른손";
		price = 1000;
		
		System.out.println("나는 생성자");
	}
	
	//생성자 오버로딩
	public Note( int page, int price ) {
		brand = "바른손";
		this.page = page;
		this.price = price;
	}
	
	public void printNote() {
		System.out.println("회사 : " + brand);
		System.out.println("페이지 : " + page);
		System.out.println("가격 : " + price);
		System.out.println("----------------------");
	}
	
}














































