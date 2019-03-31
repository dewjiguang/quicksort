package Book;

public class OrderItem {
	String bookName;
	double price;
	int num;
	public OrderItem(String bookName, double price, int num) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.num = num;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	
}
