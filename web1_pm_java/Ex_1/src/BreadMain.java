import java.util.Scanner;

public class BreadMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		String name = sc.next();
		Bread b = new Bread();
		b.makeBread();
		b.makeBread(num);
		b.makeBread(name,num);
		
	}
}
