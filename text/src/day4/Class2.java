package day4;

public class Class2 {

	public static void main(String[] args) {
		double a=123.4567;
		int b=3;
		long temp=Math.round(a*Math.pow(10, b));
		double ft=(double)temp/Math.pow(10, b);
		System.out.println(ft);
	}
}
