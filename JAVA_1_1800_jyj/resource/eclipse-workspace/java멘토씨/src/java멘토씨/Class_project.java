package java멘토씨;

public class Class_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car2.wheel);
		Car2 mycar1=new Car2();
		System.out.println(mycar1.speed);
		
		Car2 mycar2=new Car2();
		
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed:"+mycar1.speed);
		System.out.println("myCar2.speed:"+mycar2.speed);
		System.out.println("myCar1.speed:"+mycar1.wheel);
		System.out.println("myCar2.speed:"+mycar2.wheel);
		
		mycar2.speed=100;
		mycar2.wheel=5;
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed:"+mycar1.speed);
		System.out.println("myCar2.speed:"+mycar2.speed);
		System.out.println("myCar1.speed:"+mycar1.wheel);
		System.out.println("myCar2.speed:"+mycar2.wheel);
		
		
	}

}
class Car2{
	static int wheel=4; // 클래스
	int speed; //인스턴스 변수
	
}