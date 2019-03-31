package text1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		sc.close();
		System.out.println(a);
		System.out.println(b);
		boolean bb=false;
		System.out.println("aa"+bb);

	}
	

}
