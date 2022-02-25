package ex5_operator;

public class Ex1_Work {
	public static void main(String[] args) {
		/*
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 과일의 양은 각각
		 //5개,7개,5개다.
		1)과수원에서 하루에 생산되는 과일의 총갯수를 출력
		2)시간당 전체 과일의 평균 생산 갯수를 출력
		
		  단,과일의 갯수를 저장할 변수는 정수
		  하루생산량 변수 정수
		  시간단 평균 생산 갯수 저장할 변수 float
		결과 --
		하루 생산량 :17
		시간당 평균 : 0.708
		 */
		int apple =5;
		int pear=7;
		int orange =5;
		
		int total = apple+pear+orange;
		float avg = total/24f;
		System.out.println(total);
		System.out.println(avg);
	}
}
