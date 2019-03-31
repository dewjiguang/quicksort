package text1;

import java.util.Scanner;



/**
 * 运算符和表达式
 * 算术运算符：+ - * / % ++ -- += -=
 * 逻辑运算符：& | ! && || 
 * 关系运算符：> < != <= >= ==
 * 位运算符：   & | ^ ~
 * 三元运算符：  ? :
 */
public class Text2 {

	public static void main(String[] args) {
	
		
	
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num<1000||num>9999)
			System.out.println("输入数字不正确");
		else {
		
		int a=num/1000;
		int b=num%1000/100;
		int c=num%100/10;
		int d=num%10;
		
		int result =a+b+c+d;
		System.out.println(result);
		if(result>=20)
			System.out.println("一等奖");
		else if(result%11==0&&result>20)
			System.out.println("特等奖");
		else
			System.out.println("没中奖");
		}
		s.close();
	}
		
	
	
	/**
	 * 算术运算
	 * 用户输入一个四位正整数，计算是否中奖？
	 * 中奖规则：
	 * 各个位上的数字相加>=20 中一等奖
	 * 如果相加结果是11的倍数且大约20的  特等奖
	 */
	
		
		
	

}
