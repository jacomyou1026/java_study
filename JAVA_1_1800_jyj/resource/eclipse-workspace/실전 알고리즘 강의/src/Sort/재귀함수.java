package Sort;

public class Àç±ÍÇÔ¼ö {
	static int factorial(int n) {
		if(n==1) {
			System.out.println(n);
			return n;
		}
		System.out.print(n+" * ");
		return n*factorial(n-1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d\n",factorial(4));
	}}
