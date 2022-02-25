package java_실습;

public class avg_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.3,3.4},{2.3,3.5},{4.3,3.2},{3.3,4.4}};
		double sum=0;
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum+=score[year][term];
			}
		}
		int n=score.length;
		int m=score[0].length;
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
	}

}
