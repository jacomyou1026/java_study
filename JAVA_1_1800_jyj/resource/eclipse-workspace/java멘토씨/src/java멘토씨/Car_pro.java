package java멘토씨;

public class Car_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1 = new Car();
		Car mycar2 = new Car();
		mycar1.color ="red";
		mycar2.color ="black";
		mycar1.speedUp();
		mycar2.speedDown();
		mycar2.wiper();
		System.out.println("mycar1의 색: "+mycar1.color);
		System.out.println("mycar2의 색: "+mycar2.color);
		
		System.out.println("mycar1의 속도: "+mycar1.speed);
		System.out.println("mycar2의 속도: "+mycar2.speed);
		
		System.out.println("mycar1의 와이퍼 작동여부: "+mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동여부: "+mycar2.wiperOn);
		
	}

}

