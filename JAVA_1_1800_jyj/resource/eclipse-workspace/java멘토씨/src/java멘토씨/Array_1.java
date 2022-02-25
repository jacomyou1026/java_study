package java∏‡≈‰ææ;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= new int[3];
		score[0]=23;
		score[1]=234;
		score[2]=2253;
		int sum=0;
		int count=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
			System.out.println("score : "+score[i]);
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
