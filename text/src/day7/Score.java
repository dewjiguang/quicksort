package day7;

import java.util.Scanner;

public class Score {
	private Student[] num;
	Score(int length)
	{
		num=new Student[length];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<length;i++)
		{
			System.out.println("请输入第"+(i+1)+"个姓名：");
			String name=sc.next();
			System.out.println("请输入第"+(i+1)+"个成绩：");
			float score=sc.nextFloat();
			num[i]=new Student(name,score);
			num[i].setName(name);
			num[i].setScore(score);
		}
		System.out.println("录入完成");
		sc.close();
	}
	public boolean ifsmall60()
	{
		
		for(Student s:num)
		{
			if(s.getScore()<60)
				for(Student a:num)
				a.allbig60();
				
		}
		return true;
	}
	public void printf()
	{
		for(Student s:num)
		{
			System.out.println(s.getName()+"的成绩是："+s.getScore());
		}
	}
	

}
