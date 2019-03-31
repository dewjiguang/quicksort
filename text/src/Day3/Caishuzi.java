package Day3;

import java.util.Scanner;

public class Caishuzi {
	public static void main(String[] args) {
		//Cai();
//		System.out.println("请输入要输入的十进制");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		
//		System.out.println(toHex(a));
		int a[]=new int[3];
		backDay();
		//chengfabiao();
	
		money();
		
		dengyao();
		lingxing();
		
		
		
	}
	public static void Cai()
	{
		int random=(int)(Math.random()*100);
		System.out.println("请输入您猜测的数字：");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		do {
			if (input < random) {
				System.out.println("小了");
				Scanner sc1 = new Scanner(System.in);
				input = sc1.nextInt();
			} else if (input > random) {
				System.out.println("大了");
				Scanner sc2 = new Scanner(System.in);
				input = sc2.nextInt();
			}

		} while (input != random);
		System.out.println("准了");
		sc.close();
		
		
	}
	public static String toHex(int num)
	{
		String tem="";
		String temp="";
		
		do {
			temp=Integer.toString(num%16);
			switch(temp)
			{
			case"10":temp="A";break;
			case"11":temp="B";break;
			case"12":temp="C";break;
			case"13":temp="D";break;
			case"14":temp="E";break;
			case"15":temp="F";break;
			
			}
			tem=temp+tem;
			num=num/16;
		} while (num!=0);
		return tem;
	}
	public static int backDay()
	{
		System.out.println("请分别输入年月日：");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		int year=sc1.nextInt();
		int month=sc2.nextInt();
		int day=sc3.nextInt();
		boolean runYear;
		int temp=0;
		if((year%4==0&&year%400!=0)||(year%400==0))runYear=true;
		else runYear=false;
		while((month-1)!=0)
		{
			
			switch (month-1) {
			case 1:temp=temp+31;break;
			case 2:if(runYear==true)temp=temp+29;else temp=temp+28;break;
			case 3:temp=temp+31;break;
			case 4:temp=temp+30;break;
			case 5:temp=temp+31;break;
			case 6:temp=temp+30;break;
			case 7:temp=temp+31;break;
			case 8:temp=temp+31;break;
			case 9:temp=temp+30;break;
			case 10:temp=temp+31;break;
			case 11:temp=temp+30;break;
			case 12:temp=temp+31;break;
			default:
				break;
			}
			month--;
		}
		sc1.close();
		sc2.close();
		sc3.close();
		System.out.println(temp+day+"天");
		return temp+day;
	}
	public static void money()
	{
		double money=10000.0;
		int i=1;
		for(;money>=1000;i++)
		{
			if(i%2!=0)money=1.1*money;
			else money*=0.9;
		}
		System.out.println("第"+i+"天后钱小于1000");
     
	}
	public static void dengyao()
	{
		/*     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 外行内列
         */
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4-i;j++)
				System.out.print(" ");
			for(int k=0;k<1+i*2;k++)
				System.out.print("*");
			for(int j=0;j<4-i;j++)
				System.out.print(" ");
			System.out.println();
			
		}
			
	}
	public static void chengfabiao()
	{
		for(int i=1;i<10;i++)
		{
			for(int j=9;j<=10-i;j--)
				System.out.print(i*j);
				
				System.out.println();
		}
	}
	public static void lingxing()
	{/*  *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 * 外行内列
         */
		
		
		
		for(int i=0;i<9;i++)
		{
			if(i<5)
			{
			for(int j=0;j<4-i;j++)
				System.out.print(" ");
			for(int k=0;k<1+i*2;k++)
				System.out.print("*");
			for(int j=0;j<4-i;j++)
				System.out.print(" ");
			}
			else
			{
				for(int j=0;j<i-4;j++)
					System.out.print(" ");
				for(int k=0;k<17-i*2;k++)
					System.out.print("*");
				for(int j=0;j<i-4;j++)
					System.out.print(" ");
			}
			
			
			
			
			System.out.println();
			
		}
		
	}

}
