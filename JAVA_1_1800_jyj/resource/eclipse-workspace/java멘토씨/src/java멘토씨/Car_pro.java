package java���侾;

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
		System.out.println("mycar1�� ��: "+mycar1.color);
		System.out.println("mycar2�� ��: "+mycar2.color);
		
		System.out.println("mycar1�� �ӵ�: "+mycar1.speed);
		System.out.println("mycar2�� �ӵ�: "+mycar2.speed);
		
		System.out.println("mycar1�� ������ �۵�����: "+mycar1.wiperOn);
		System.out.println("mycar2�� ������ �۵�����: "+mycar2.wiperOn);
		
	}

}

