package ex2_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		//���� �����
		//new Random().nextInt(�߻���ų ������ ����)+���� ��;
		//new Random().nextInt(ū��-������+1)+���� ��;
		int r = new Random().nextInt(32423-1176+1)+1176;
		System.out.println(r);
		
		
	}
}
