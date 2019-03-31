package text;
public class Mytext 
{
	
	public static void main(String args[])
	{
		
		Mytext m=new Mytext();
		
//		char a[]={'1','2','3','4'};
		int a[]= {66,3,7,4,2,100,1000};
		//System.out.println(m.kthLargestElement(6,c));
		m.quicksort(0, 6, a);
		for(int i=0;i<6;i++) {System.out.println(a[i]);}
		//m.fa(a);
	
		
	}

	/*
	 * public int kthLargestElement(int n, int[] nums) { // write your code here
	 * for(int i=0;i<=nums.length-1;i++) { for(int j=i;j<=nums.length-1;j++) {
	 * if(nums[i]>nums[j]) { int temp=nums[i]; nums[i]=nums[j]; nums[j]=temp; } } }
	 * return nums[n-1]; }
	 * 
	 * void fa(char a[]) { System.out.println(a[0]); System.out.println(a[1]);
	 * System.out.println(a[2]); System.out.println(a[3]); }
	 */
	void quicksort(int left,int right,int a[])
	{
		int i,j,temp;
		i=left;j=right;
		temp=a[left];
		while(left<right)
		{
			
			while(a[j]>=temp&&i<j)
				{j--;}
			while(a[i]<=temp&&i<j)
				{i++;}	
			swap(i,j,a);
			
			
		}
		swap(left,i,a);
		quicksort(left,i-1,a);
		quicksort(i+1,right,a);
		
	}
	private void swap(int i, int j,int[] a) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		
	}

	
	
}
