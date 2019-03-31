package Book;

public class Book {
	int bookId;
	String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	double price;
	int storage;
	Book(int bookId,String bookName,double price,int storage)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
		this.storage=storage;
	}

}
