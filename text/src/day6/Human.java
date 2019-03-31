package day6;

public class Human {
	private int years;
	private int a[];//可以定义引用类型，
	Object j=new Object();
	
	

	public int getYears() {
		return years;
		
		
	}

	public void setYears(int years) {
		this.years = years;
	}
	public void charge()
	{
		if(this.years<=5)
			System.out.println("免票");
			else if(this.years<=18)
				System.out.println("半票");
			else System.out.println("全票");
	}

}
