package java¸àÅä¾¾;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start =System.currentTimeMillis();
		System.out.println(start);
		int a =0;
		for(int i=1;i<10000000;i++ ) {
			a++;
		}
		long end = System.currentTimeMillis();
		System.out.println("end"+end);
		System.out.println(end-start);
	}

}
