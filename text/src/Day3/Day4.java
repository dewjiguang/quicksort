package Day3;

import java.util.Scanner;

public class Day4 {
	public static void main(String[] args) {
		//sushu();
//		maopao();
//		nixu();
//		maxnum();
//		int[] a= {1,2,5,7,8,9,45,56,89,99,102,154,185,999,9877};//15个数
//		int[] b= {4,8,13,24,54,65,74,85,95,99,222};//11个数
//		int[] c=mergeSortedArray2(a,b);
//		int[] d={12,123,4124,345,546,2423,12335,6346,412414,4353452,1412,325,2342,534,24,56,78,43,3,32};
//		Arrays.sort(d);
//		for (int i = 0; i < d.length; i++) 
//			System.out.println(d[i]);
		int a=Integer.MAX_VALUE;//里面的一个静态常量
//		Math m=new Math();
		int b=(int) Math.random();
		Caishuzi.Cai();
		
		
		
		System.out.println(a<<1);
	}
	static void sushu()
	{
		System.out.println("请输入一个数：");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		for(int a=0;a<b;a++)
		{
		if((a%2!=0&&a%3!=0&&a%5!=0&&a%7!=0)||(a==1)||(a==2)||(a==3)||(a==5)||(a==7))
			System.out.println(a);
		}
		
		sc.close();
		
	}
	public static void nixu()
	{
		System.out.println("逆序排列为：");
		int[] a = { 21, 45, 345, 63453, 234, 43, 4675, 23, 0, 13 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i-1];
			a[a.length - i-1] = temp;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
	public static void maopao()
	{
		int[] a= {3,23,23,3434,53,42,56,4564,345,10};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]<a[j+1]);
				else {int temp=a[j];a[j]=a[j+1];a[j+1]=temp;}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void insert()
	{
		int[] a= {3,23,23,3434,53,42,56,4564,345,10};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]<a[j+1]);
				else {int temp=a[j];a[j]=a[j+1];a[j+1]=temp;}
				
			}
			
		}
		int b=88;
		int[] c=new int[a.length+1];
		int j=-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>b) {j=i;break;}
				
			
		}
		if(j!=-1)
		{
			for (int i = 0; i < j; i++) {
				c[i]=a[i];
				
			}
			for (int i = 0; i < c.length-j; i++) {
				c[c.length-j]=a[c.length-j-1];
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void maxnum()
	{
		int[] a= {123,1231,3242,535,46,78768,35,234,4353,2345,5843};
		int temp=a[0];
		for (int i = 0; i < a.length; i++) {
			if(temp<a[i])temp=a[i];
			
		}
		System.out.println("最大的数为"+temp);
	}

	public static int[] mergeSortedArray(int[] A, int[] B) {
		// write your code here
		int[] c = new int[A.length + B.length];
		int i=0,j=0;
		while(true)
		{

			if(i==A.length)
			{
				
				for(;j<B.length;j++)
				c[i+j]=B[j];
				break;
			}
			if(j==B.length)
			{
			
				for(;i<A.length;i++)
					c[i+j]=A[i];
				break;
			}
			if(A[i]<=B[j])
			{
				c[i+j]=A[i];
				i++;
				continue;
			}
			if(A[i]>B[j])
			{
				c[i+j]=B[j];
				j++;
				continue;
			}
			
		}
		
		
//		for (int i = 0, j = 0; i < A.length || j < B.length;) {
//			if (i<(A.length)&&(A[i] <= B[j])) {
//				c[i + j] = A[i];
//				i++;
//
//			} else if(j<B.length) {
//				c[i + j] = B[j];
//				j++;
//			}
//		}

		return c;

	}
	public static int[] mergeSortedArray2(int[] A, int[] B) {
		int[] c=new int[A.length+B.length];
		int i=0,j=0;
		for(int z=0;z<(A.length+B.length);z++)
		{
			if(A[i]>=B[j])
			{
				c[i+j]=B[j];
				if(j<A.length)
				j++;
			}
			if(A[i]<B[j])
			{
				c[i+j]=A[i];
				if(i<B.length)
				i++;
			}
			if(i==A.length)
			{
				for(;j<B.length;j++)
					c[i+j]=B[j];
			}
			if(j==B.length)
			{
				for(;i<A.length;i++)
					c[i+j]=A[i];
			}
			
		}
		
		
		
		
		return c;
		
	
	}

}
