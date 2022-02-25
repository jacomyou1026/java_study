package pack1.pack2;
import java.util.*;
public class Ex0405 {
	public static void main(String[] args) {
		System.out.println("출력할 문자열을 입력하세요!:");
		Scanner scan = new Scanner(System.in);
		String instr=scan.nextLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println(str);
		System.out.println(str.reverse());
	}

}
