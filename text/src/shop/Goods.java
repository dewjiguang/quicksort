package shop;

public class Goods {
	int num;
	String name;
	double money;
	static int temp=0;
	public Goods( String name, double money) {
		super();
		this.num = temp+1;
		this.name = name;
		this.money = money;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
