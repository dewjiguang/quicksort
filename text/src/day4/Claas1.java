package day4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Claas1 {
	public static void main(String[] args) {

		int[][] a=new int[5][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[3];
		a[3]=new int[3];
		a[4]=new int[3];
		System.out.println(System.getProperty("os.name"));
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(int)(Math.random()*100);
				
			}
		}
		System.out.println(Arrays.deepToString(a));
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j]);
//				
//			}
//			System.out.println();
//			
//		}
	

		yanghui();
	}

	static void yanghui() {
		int a[][] = new int[10][];
		for (int i = 0; i < a.length; i++) {// 构造二维数组
			for (int j = 0; j < i + 1; j++) {
				a[i] = new int[j + 1];

			}

		}
		
		for (int i = 0; i < a.length; i++) {//赋值
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					a[i][j] = 1;
					continue;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}

			}

		}
		for (int i = 0; i < a.length; i++) {// 打印
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);

			}
			System.out.println();

		}

	}

}
