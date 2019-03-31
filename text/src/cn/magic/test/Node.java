package cn.magic.test;

public class Node {
	private String data;
	private Node nxet;//
	
	public Node(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNxet() {
		return nxet;
	}
	public void setNxet(Node nxet) {
		this.nxet = nxet;
	}
	
	
	
	
}
