package day6;

import java.util.Scanner;

public class BookManager {

	//类数组
	static Book[] books = new Book[10];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	
	public void start() {
		System.out.println("*************************");
		System.out.println("*******欢迎使用图书借阅系统***");
		System.out.println("*************************");
	}
	
	public static void add() {
		System.out.println("请输入书名：");
		String bookName = sc.next();
		System.out.println("请输入作者：");
		String author = sc.next();
		System.out.println("请输入价格：");
		float price = sc.nextFloat();
		
		//属性封装到对象中
		Book book = new Book(bookName,author,price);
		
		boolean isFull = true;
		//找出空位
		for (int i = 0; i < books.length; i++) {
			if(books[i]==null) {
				isFull = false;
				books[i] = book; //对象放入数组
				break;
			}
		}
		
		if(isFull) {
			System.out.println("添加失败！已满！");
		}else {
			System.out.println("***添加成功！*****");
		}
		menu();
	}
	public static void delate()
	{
		System.out.println("请输入要删除的书名：");
		String input=sc.next();
		boolean ifdelate=false;
		int i=0;
		for(Book s:books)
		{
			if(books[i]!=null&&i<10)
				{
				if(s.getBookName().equals(input))
				{
					books[i]=null;
					ifdelate=true;
					break;
				}
				
				i++;
			}
			else continue;
		}
		if(ifdelate)
			System.out.println("删除成功");
		else
			System.out.println("删除失败");
		menu();
	
	}
	public static void search()
	{
		System.out.println("请输入要查询的书名：");
		String input=sc.next();
		
		for(Book b:books)
		{
			if(b.getBookName().equals(input))
			{
				System.out.println("该书详细信息如下：");
				System.out.print("书名："+b.getBookName()+"\t作者："+b.getAuthor()+"价格："+b.getPrice()+"状态：");
				if(b.getState()==1)
					System.out.println("已借出");
				else
					System.out.println("未借出");
				break;
			}
		}
		menu();
	}
	/**
	 * 	列表
	 */
	public static void list() {
		System.out.println("图书名\t作者\t价格\t状态");
		for (Book book : books) {
			if(book==null) {
				continue;
			}
			String name = book.getBookName();
			String author = book.getAuthor();
			float price = book.getPrice();
			byte state = book.getState();
			System.out.println(name+"\t"+author+"\t"+price+"\t"+state);
		}
		menu();
	}
	public static void change()
	{
		
	}
	public static void menu()
	{
		System.out.println("--------------------------");
		System.out.println("1.录入书籍信息");
		System.out.println("2.删除书籍信息");
		System.out.println("3.查找书籍信息");
		System.out.println("4.显示书籍信息");
		System.out.println("5.更改书籍信息");
		System.out.println("6.退出书籍信息");
		System.out.println("--------------------------");
		
		System.out.println("请输入要进行的操作");
		switch (sc.nextInt()) {
		case 1:
			add();
			break;
		case 2:
			delate();
			break;
		case 3:
			search();
			break;
		case 4:
			list();
			break;
		case 5:
			change();
			break;
		case 6:
			
			break;

		default:
			System.out.println("输入有误");
			menu();
			break;
		}
		
	}
}

/**
 * 	图书类
 *
 */
class Book{
	public static final byte STATE_LEND = 1;
	public static final byte STATE_NOTLEND = 2;
	private String bookName;
	private String author;
	private float price;
	private byte state;
	
	public Book(String bookName,String author,float price,byte state) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.state = state;
	}
	public Book(String bookName,String author,float price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.state = STATE_NOTLEND;
	}
	public Book() {}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
}
