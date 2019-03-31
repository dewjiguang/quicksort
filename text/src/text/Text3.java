package text;

import java.util.Arrays;

public class Text3 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		sort(arr);
		quicksort(arr,0,arr.length-1);
//		System.out.println(BinarySearch(arr,1));
	}
	public static void sort(int[] arr)
	{
	
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static int BinarySearch(int[] arr,int aim)
	{
		int left=0,right=arr.length-1;//角标
		int backnum=-1;//没找到是-1
		int mid;
		while(left<=right) {
			mid=left+right;
			if(arr[mid]==aim)
				return mid;
			else if(arr[mid]<=aim)
				left=mid+1;
			else
				right=mid-1;
		}
		return backnum;
		
	}

	public static void quicksort(int[] a, int left, int right) {

		int i = left;
		int j = right;
		int temp = a[left];
		if (left >= right)
			return;
		while (i != j) {
			while (i < j && a[j] >= temp)
				j--;
			if (j > i)
				a[i] = a[j];// a[i]已经赋值给temp,所以直接将a[j]赋值给a[i],赋值完之后a[j],有空位
			while (i < j && a[i] <= temp)
				i++;
			if (i < j)
				a[j] = a[i];
		}
		a[i] = temp;// 把基准插入,此时i与j已经相等R[low..pivotpos-1].keys≤R[pivotpos].key≤R[pivotpos+1..high].keys
		quicksort(a, left, i - 1);/* 递归左边 */
		quicksort(a, i + 1, right);/* 递归右边 */

	}

}
