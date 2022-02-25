package ex2_animal;

public class AnimalMain {
	public static void main(String[] args) {
		Cat c1 =new Cat();
		System.out.println("°í¾çÀÌ");
		System.out.println("´« : "+c1.getEye());
		System.out.println("´Ù¸® : "+c1.getLeg());
		System.out.println("Æ¯ÀÌ»çÇ× : "+c1.balance);
		
		System.out.println("--------------");
		Bear b1 = new Bear();
		System.out.println("°õ");
		System.out.println("´« : "+b1.getEye());
		System.out.println("´Ù¸® : "+b1.getLeg());
		System.out.println("Æ¯ÀÌ»çÇ× : "+b1.woong);
		System.out.println("--------------");
		Snake s1= new Snake();
		System.out.println("¹ì");
		System.out.println("´« : "+s1.getEye());
		System.out.println("¹ì : "+s1.getLeg());
		System.out.println("Æ¯ÀÌ»çÇ× : "+s1.sensor);
		
	}
}
