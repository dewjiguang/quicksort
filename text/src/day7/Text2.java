package day7;

public class Text2 {
	protected int from2;
	void function3()
	{
		function4();
	}
	  void function4()
	{
		
	}
	Text2()
	{
		System.out.println("这是构造函数");
	}
public static void main(String[] args) {
	Text2 t=new Text2();
	Text3 f=new Text3();
	f.from2=2;
	f.from3=3;

System.out.println( t instanceof Text2);	
	
}
int a;
void function1()
{
	System.out.println(a);
}
static{
	System.out.println("这是静态块1");
}
static{
	System.out.println("这是静态块2");
}
{
	System.out.println("这是非静态块");
}
}
