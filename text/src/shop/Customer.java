package shop;

public class Customer {
	static int log;
	
	private int num;
	private String birth;
	private int count;
	public static int getLog() {
		return log;
	}
	public static void setLog(int log) {
		Customer.log = log;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Customer(String birth, int count) {
		super();
		this.num = log;
		this.birth = birth;
		this.count = count;
		log++;
	}
	public Customer() {
		super();
	}
	

}
