package ex2_random;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int ran = new Random().nextInt(45) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
		
		//1 ~ 45������ ������ �߻����� �ζǹ�ȣ �����ϱ�
		//11 6 19 22 41 23
		int[] lotto = new int[6];
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = new Random().nextInt(45) + 1;
			
			for( int j = 0; j < i; j++ ) {//�ߺ��� �񱳸� ���� for��
				if( lotto[i] == lotto[j] ) {
					continue outer;
				}
			}//inner
			
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
		
		
	}//main
}






































