package day7;

public class Textn {
	Animal a=new Dog();
	Animal b=new Cat();
	
	static void restruant(Animal z)
	{
		z.eat();
	}
	public static void main(String[] args) {
		Dog a=new Dog();
		Cat b=new Cat();
		restruant(a);
		restruant(b);
		
	}

}
