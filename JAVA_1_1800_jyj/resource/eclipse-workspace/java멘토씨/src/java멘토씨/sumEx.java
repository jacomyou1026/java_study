package java¸àÅä¾¾;

import java.util.Scanner;

public class sumEx {

	public static void main(String[] args) {
		// TODO Auto-generated me
		System.out.println(sum(10,20));
		System.out.println(sum(10.1,20.2));
		System.out.println(div(10,20));
		System.out.println(div(10.4,20.4));
		System.out.println(mul(10,20));
		System.out.println(mul(10.2,20.3));
		System.out.println(sum("whl","/ndg"));
	}
	static int sum(int x,int y) {
	return x+y;	
	}
	static double sum(double x,double y) {
		return(x+y);	
	}	
	static int div(int x,int y) {
		return (x/y);	
	}
	static double div(double x,double y) {
		return (x/y);	
	}	
	static int sub(int x,int y) {
		return (x-y);	
	}
	static double sub(double x,double y) {
		return x-y;	
	}	
	static int mul(int x,int y) {
		return (x*y);	
	}
	static double mul(double x,double y) {
		return (x*y);	
	}	
	
	static String sum(String x,String y) {
		return x+y;
	}
}
