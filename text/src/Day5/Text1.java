package Day5;

import java.util.Scanner;

public class Text1 {
	public static void main(String[] args) {

		checkEmail();

	}

	public static boolean ifemail(String str) {
		if (str.contains("@") && str.contains(".") && str.lastIndexOf("@") + 1 < str.lastIndexOf("."))
			return true;
		else
			return false;
	}

	public static boolean ifname(String str) {
		if (str.indexOf("\\d") != 0)
			return false;
		else
			return true;
	}

	public static void Intelligence() {
		Scanner sc = new Scanner(System.in);
		String str2 = sc.next();
		System.out.println(str2.replace("£¿", "!").replace("Äã", "ÎÒ").replace("Âð", ""));
		sc.close();
		int[] arr= {1,2,3,4,5};
		for (int i : arr) {
			System.out.println(arr[i-1]);
			
			
		}
	}
	public static void checkEmail()
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.matches("\\d{4}-\\d{7,8}||\\d{7,8}"))
			System.out.println("ÊÇ");
		else
			System.out.println("·ñ");
		sc.close();
			
		//"//w+@//w+.com"
	}

}
