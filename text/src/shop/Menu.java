package shop;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Menu {
	public static int mainmenu(Scanner sc)
	{
		System.out.println("            欢迎使用我行我素购物管理系统");
		System.out.println("*****************************************");
		System.out.println("            1.客户管理系统");
		System.out.println("            2.购物结算");
		System.out.println("            3.真情回馈");
		System.out.println("            4.注销");
		System.out.println("*****************************************");
		System.out.print("请选择，输入数字：");
		int a=sc.nextInt();
		
		return a;
	}
	public static int customermenu(Scanner sc)
	{
		System.out.println(" 我行我素购物管理系统>客户信息管理");
		System.out.println("*****************************************");
		System.out.println("            1.显示所有客户信息");
		System.out.println("            2.添加客户信息");
		System.out.println("            3.修改客户信息");
		System.out.println("            4.查询客户信息");
		System.out.println("*****************************************");
		System.out.print("请选择，输入数字或按‘n’返回上级菜单：");
		String st=sc.next();
		if(st.equals( "n")) {
			
			return 0;
		}
		else if(st.matches("[1-4]"))
			return Integer.parseInt(st);
		else if(st.matches("n")){
			
			return 0;
			
		}
		else {
			System.out.println("输入有误");
	
			return 0;
		}
	}
	public static void buymenu(Goods[] goods,Customer[] cu,Scanner sc) {
		System.out.println("我行我素购物管理系统——————》购物结算");
		System.out.println("**********************************");
		System.out.println("请选择购买的商品：");
		System.out.println("1.addidas运行鞋");
		System.out.println("2.Kapa网球裙");
		System.out.println("3.网球拍");
		System.out.println("4.addidasT恤衫");
		System.out.println("5.NIKE运动鞋");
		System.out.println("6.KAPA网球");
		System.out.println("7.KAPAT恤");
		System.out.println("**********************************");
		System.out.print("请输入会员号：");
		int num=sc.nextInt();
		for (Customer customer : cu) {
			if(customer==null)
				break;
			else if(customer.getNum()==num)
			{
				System.out.println("请输入商品编号：");
				int bianhao=sc.nextInt();
				for (Goods good : goods) {
					if(good==null)break;
					if(good.getNum()==(bianhao))
					{
						System.out.println("请输入数目：");
						int count =sc.nextInt();
						System.out.println("*****************商品清单***********************");
						System.out.println("            物品               单价                 个数                   金额");
						System.out.println();
						System.out.println(good.getName()+"         "+good.getMoney()+"                   "+count+"                   "+"￥"+good.getMoney()*count);
						System.out.println("*********************************************");
						System.out.println("折扣   0.9");
						System.out.println("金额总计：￥"+good.getMoney()*count*0.9);
						System.out.println("本次购物所获得积分为："+(int)(good.getMoney()*count*0.9/100));
						customer.setCount((int)(good.getMoney()*count*0.9/100)+customer.getCount());
						System.out.println("您的剩余积分为："+customer.getCount());
						break;
					}
					
				}
			}
			
		}
		System.out.println("是否继续购买？Y/N");
		String newtemp=sc.next();
		if(newtemp.equals("Y")||newtemp.equals("y"))
			buymenu(goods, cu, sc);
		else return;
			
		
	
	}

}
