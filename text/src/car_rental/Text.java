package car_rental;

import java.util.Scanner;

public class Text {
	static {
		System.out.println("静态块");
	}
	{
		System.out.println("非静态块");
	}
	
	Text()
	{
		System.out.println("构造方法");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Text t=new Text();
		
		
		menu();
		
	}
	
	public static void menu()
	{

		
		Car smallcar=new SmallCar();
		Car bigcar=new BigCar();
		Rental rent=new Rental();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("********欢迎光临腾飞汽车租赁公司********");
		System.out.println("1，轿车    2，客车");
		System.out.println("请选择你要租赁的汽车类型：");
		try {
		int model=sc.nextInt();
		
		if(model==1)
		{
			System.out.println("请选择你要租赁的汽车品牌：");
			System.out.println("1,宝马x6    2.宝马550i");
			System.out.println("3.别克林荫大道   4.别克GL8");
			int singal=sc.nextInt();
			if(!(singal==1||singal==2||singal==3||singal==4))
				error();
			System.out.println("请选择你要租赁的天数：");
			String days=sc.next();
			if(!((days.matches("[0-9]+"))&&!(days.matches("[0]+"))))
				error();
			
			int day=Integer.parseInt(days);
			double count=smallcar.calRent(day);
			rent.rent_Smallcar(singal,day,count);
			
			
			
		}
		else if(model==2)
		{
			System.out.println("请选择你要租赁的汽车品牌：1.金龙   2.金杯");
			int singal=sc.nextInt();
			if(!(singal==1||singal==2))
				error();
			System.out.println("请选择你要租赁的汽车座位数：1.16座   2.34座");
			int seat=sc.nextInt();
			if(!(singal==1||singal==2))
				error();
			System.out.println("请输入你要租赁的天数：");
			int day=sc.nextInt();
			double count=bigcar.calRent(day);
			rent.rent_Bigcar(singal, seat, day, count);
			sc.close();
		}
		else 
			error();
		}
		catch(Exception e) {error();}
	
	}
	
	
	public static void error()
	{
		System.out.println("输入有误！请重新输入！");
		menu();
	}
	


}
