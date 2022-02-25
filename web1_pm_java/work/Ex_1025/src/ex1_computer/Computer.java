package ex1_computer;

public class Computer {
	//클래스의 구성 요소
	//속성, 변수, 멤버
	//메서드, 기능, 함수
	
	private String company = "apple";
	int ssd = 200;
	int ram = 512;
	String graphic = "intel";
	String color = "white";
	
	//컴퓨터의 정보를 보여줄 메서드
	//메서드 : 어떠한 작업을 수행하기 위한 명령문들의 집합
	public void myPc() {
		System.out.println("brand : " + company);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("graphic : " + graphic);
		System.out.println("color : " + color);
		System.out.println("-----------------------");
	}
	
	//메서드의 구성
	//접근제한자   반환형    메서드명
	//public     void     myPc( 파라미터(인자,매개변수,아규먼츠)  ){ 메서드호출시 실행영역 }
	
	//접근제한자
	//1.public : 같은 프로젝트 내의 모든 클래스에게 접근을 허용
	//2.private : 현재 클래스에서만 사용을 허가
	//3.protected : 상속관계의 클래스에서만 사용을 허가
	//4.default(기본값) : 같은 패키지 내의 클래스에게만 접근을 허용
}



































