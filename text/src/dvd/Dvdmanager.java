package dvd;

import java.util.Scanner;

public class Dvdmanager {
	static int bianhao=0;
	Scanner sc=new Scanner(System.in);
	
	static Dvd dvd=new Dvd();//头结点
	public void add(){//创建新的对象链接到链表最后
		System.out.println("请输入DVD的名称:");
		String name=sc.nextLine();
		
		/*
		 * Dvd d1 = Tool.lastdvdindex(dvd).getIndex();
		 * 
		 * // Dvd d2 = new Dvd(bianhao,name);
		 */
		//d1 = d2;
		 Dvd d2 = new Dvd(bianhao,name);
		 
		Dvd  d1 = Tool.lastdvdindex(dvd) ;//.getIndex();
		
	}

}
