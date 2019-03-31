package dvd;

public class Dvd {

	private int id;
	private String name;
	private boolean status;
	private String borrowTime;
	private int count;
	private Dvd index=null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Dvd getIndex() {
		return index;
	}
	public void setIndex(Dvd index) {
		this.index = index;
	}
	public Dvd(int id, String name, boolean status, String borrowTime, int count, Dvd index) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.borrowTime = borrowTime;
		this.count = count;
		this.index = index;
	}
	public Dvd() {
		super();
	}
	public Dvd(int id,String name) {
		super();
		this.id = id;
		this.name = name;
		this.status = true;
		this.borrowTime = "Î´½è³ö";
		this.count = 0;
		this.index = null;
	}
}
