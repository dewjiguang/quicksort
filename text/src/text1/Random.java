package text1;


import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		System.out.println(Math.random());
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int random=(int)(Math.random()*10);
		if(a%1000/100==random)
		{
			System.out.println("中奖");
		}
		else
			System.out.println("没中奖"+"random为："+random+"我的值为："+a%1000/100);
	}

}
