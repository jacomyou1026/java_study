package ex2_animal;

public class AnimalMain {
	public static void main(String[] args) {
		Cat c1 =new Cat();
		System.out.println("�����");
		System.out.println("�� : "+c1.getEye());
		System.out.println("�ٸ� : "+c1.getLeg());
		System.out.println("Ư�̻��� : "+c1.balance);
		
		System.out.println("--------------");
		Bear b1 = new Bear();
		System.out.println("��");
		System.out.println("�� : "+b1.getEye());
		System.out.println("�ٸ� : "+b1.getLeg());
		System.out.println("Ư�̻��� : "+b1.woong);
		System.out.println("--------------");
		Snake s1= new Snake();
		System.out.println("��");
		System.out.println("�� : "+s1.getEye());
		System.out.println("�� : "+s1.getLeg());
		System.out.println("Ư�̻��� : "+s1.sensor);
		
	}
}
