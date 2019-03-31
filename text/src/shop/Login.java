package shop;

public class Login {
	private String name;
	private String keyword;
	public Login(String name, String keyword) {
		super();
		this.name = name;
		this.keyword = keyword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	

}
