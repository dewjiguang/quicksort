package day7;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		System.out.println("请输入要录入的人数");
		Scanner s=new Scanner(System.in);
		
	
	Score sc=new Score(s.nextInt());
	s.close();
	sc.ifsmall60();
	sc.printf();
	Text2.function4();

	}
	
}
