import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackTracking {
	public static void main(String[] args) {

	int n=3;
	int leftnum=n,rightnum=n;//左括号和右括号都各有n个
	ArrayList<String> results=new ArrayList<String>();//用于存放解空间
	parentheses("", results, leftnum, rightnum);
	for(String s:results)
		System.out.println(s);
	Map<Integer,Integer> set=new HashMap<Integer,Integer>();
	set.put(1, 2);
	set.put(1,3);
	for (Integer string : set.keySet()) {
		System.out.println(set.get(string));
	}

	}
	public static void parentheses(String sublist, ArrayList<String> results, int leftnum, int rightnum){
		if(leftnum==0&&rightnum==0)//结束
			results.add(sublist);
		if(rightnum>leftnum)//选择和条件。对于不同的if顺序，输出的结果顺序是不一样的，但是构成一样的解空间
			parentheses(sublist+")", results, leftnum, rightnum-1);
		if(leftnum>0)
			parentheses(sublist+"(", results, leftnum-1, rightnum);
		
	}
}
