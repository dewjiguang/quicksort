package project;

import java.util.Scanner;

/**
 * 	图书借阅系统：图书(书名，价格，作者，状态) 状态--可借阅  已借出
 *  1.菜单列表
 *  2.图书添加
 *  3.图书删除
 *  4.图书借阅
 *  5.图书列表
 *  6.图书详细
 *  7.还书管理
 *  8.退出系统
 *  
 *  String[] bookName = new String[10]; 
 *  String[] authors = new String[10]; 
 *  float[] price = new float[10]; 
 *  byte[] state = new byte[10];
 */
public class Library {
	private static Scanner sc = new Scanner(System.in);
	
	private final static int COUNT = 10;
	private final static int STATE_LEND = 2;	//已借阅
	private final static int STATE_NOTLEND = 1;	//未借阅
	//声明数组
	private static String[] bookNames = new String[COUNT];
	private static String[] authors = new String[COUNT];
	private static float[] prices = new float[COUNT];
	private static byte[] states = new byte[COUNT];
	
	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("****欢迎使用图书借阅系统!*****");
		System.out.println("******************************");
		
		menu();
	}
	
	/**
	 * 	菜单
	 */
	public static void menu() {
		System.out.println("\n*****请选择功能********");
		System.out.println("1.添加图书");
		System.out.println("2.修改图书");
		System.out.println("3.删除图书");
		System.out.println("4.图书列表");
		System.out.println("5.图书详细");
		System.out.println("6.借阅图书");
		System.out.println("7.归还图书");
		System.out.println("8.退出系统");
		
		int select = sc.nextInt();
		switch (select) {
		case 1:	// 添加图书
			add();
			break;
		case 2: // 修改图书
			update();
			break;
		case 3: // 删除图书
			delate();
			break;

		
		case 4: // 图书列表
			list();
			break;
		case 5: // 图书详细
			information();

			break;
		case 6: // 借阅
			lent();

			break;
		case 7: // 归还
			back();

			break;
		default:
			break;
		}
	}
	
	/**
	 * 	添加图书
	 */
	public static void add() {
		//先查找图书位置  同时查看是否已满
		int index = -1;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i]==null) {//次位置为空位
				index = i;
			
				break;
			}
		}
		
		//如果没有满
		if (index != -1) {
			System.out.println("请输入书名：");
			String bookname = sc.next();

			for (int i = 0; i < bookNames.length; i++) {
				if (bookname.equals(bookNames[i])) {
					System.out.println("抱歉，该书已存在");
					menu();
				}
			}
			bookNames[index] = bookname;
			System.out.println("请输入作者：");
			authors[index] = sc.next();
			System.out.println("请输入价格");
			prices[index] = sc.nextFloat();
			states[index] = STATE_NOTLEND;//

			System.out.println("图书添加成功！");
		}else {//已经满了
			System.out.println("书架已满！");
		}
		
		//调用菜单
		menu();
	}
	/**
	 * 	修改图书
	 */
	public static void update() {
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====书架为空！=======");
			System.out.println("修改失败");
		}else{
			System.out.println("请输入要修改的图书名称：");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				try {
				if(bookNames[i].equals(name))
					{num=i;
					break;
					}
				}
				catch(NullPointerException e)
				{
					System.out.println("未找到！");
					menu();
				}
			}
			if (num == -1)
				System.out.println("未找到");
			else {
				bookNames[num] = name;
				System.out.println("请输入价格");
				float price = sc.nextFloat();
				prices[num] = price;
				System.out.println("请输入作者");
				String author = sc.nextLine();
				authors[num] = author;
				System.out.println("修改完成");

			}
		}
		
		menu();
		
	}
	public static void delate()
	{
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====书架为空！=======");
		}else{
			System.out.println("请输入要删除的图书名称：");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				try {
				if(bookNames[i].equals(name))
					{num=i;
					break;
					}
				}
				catch(NullPointerException e)
				{
					System.out.println("未找到！");
					menu();
				}
			}
			if (num == -1)
				System.out.println("未找到");
			else {
				bookNames[num] = null;;	
				prices[num] = 0.0f;	
				authors[num] = null;

			}
		}
		System.out.println("删除完成");
		menu();
	}
	public static void lent()
	{
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====书架为空！=======");
		}else{
			System.out.println("请输入要借阅的图书名称：");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				
				if(bookNames[i].equals(bookNames[i]))
					{num=i;
					break;
					}
				}
			

			if (num == -1)
				System.out.println("未找到");
			else {
				states[num] = 2;;	
				

			}
			System.out.println("借阅完成");
		}
		
		menu();
	}
	public static void back()
	{

		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====书架为空！=======");
		}else{
			System.out.println("请输入要归还的图书名称：");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				
				if(name.equals(bookNames[i]))
					{num=i;
					break;
					}
				
				
			}
			if (num == -1)
				System.out.println("未找到");
			else {
				states[num] = 2;
				

			}
			System.out.println("归还完成");
		}
		
		menu();
	}
	public  static void information()
	{
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====书架为空！=======");
		}else{
			System.out.println("请输入要查看的图书名称：");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				
				if(name.equals(bookNames[i]))
					{num=i;
					break;
					}
				
			}
			if (num == -1)
				System.out.println("未找到");
			else {
				System.out.println("该图书详细信息如下：");
				System.out.println("书名："+bookNames[num]);
				System.out.println("价格："+prices[num]);
				System.out.println("作者："+authors[num]);
				if(states[num]==1)
				{
				System.out.println("状态：未借");
				}
				else
				{
					System.out.println("状态：已借");
					}

			}
		}
		System.out.println();
		menu();
	}
	/**
	 * 	图书列表
	 */
	public static void list() {
		System.out.println("************	图书列表	 ************"); 
		//查看是否为空
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====书架为空！=======");
		}else{
			System.out.println("图书名称\t图书价格\t图书作者\t状态");
			//不为空
			for (int i = 0; i < bookNames.length; i++) {
				if(bookNames[i]==null) {
					//
					continue;
				}
				String status = states[i]==STATE_LEND ? "已借出" : "可借阅";
				System.out.println(bookNames[i]+"\t"+prices[i]+"\t"+authors[i]+"\t"+status);
			}
		}
		
		//回显菜单
		menu();
	}
}