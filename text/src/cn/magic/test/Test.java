package cn.magic.test;

public class Test {
	
	public static void main(String[] args) {
		
		Node root = new Node("root--");
		Node n1 = new Node("node1--");
		Node n2 = new Node("node2--");
		Node n3 = new Node("node3--");
		Node n4 = new Node("node4--");
		
		root.setNxet(n1);
		n1.setNxet(n2);
		n2.setNxet(n3);
		n3.setNxet(n4);
		
		getNode(root);
		
	}

	public static void getNode(Node node) {
		System.out.print(node.getData());
		if(node.getNxet() != null) {
			getNode(node.getNxet());
		}else{
			System.out.println("\nlastNode :"+node.getData());
		}
		
	}
	
	
	
}
