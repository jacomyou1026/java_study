package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		//Try-Catch(예외처리)
		//자바에서 프로그램이 실행되는 도중 예외(에러)가 발생하면 
		//그 시점에서 프로그램이 강제적으로 종료된다
		//이것은 올바른 판단이지만, 때로는 예측 가능한 오류가 있을 때 이를 무시하고
		//정상적으로 코드를 완료해야 할 때가 있다.
		//예외처리를 통해 비정상적인 종료를 줄일 수 있다.
		
		int result = 0;
		int[] arr = new int[2];
		
		
		try {
			arr[1] = 100;
			result = 10 / 2;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			//try영역에서 예외가 발생하면 반드시 호출되는 영역
			System.out.println("배열의 존재하지 않는 index에는 값을 넣지 마세요");
			//e.printStackTrace();
	
		}catch( ArithmeticException e ) {
			System.out.println("0으로 나눌 수 없습니다");
			
		}finally {
			//예외발생 여부와 상관없이 반드시 호출되는 영역
			System.out.println("finally영역");
		}
		
		System.out.println("결과:" + result);
		
	}//main
}





















































