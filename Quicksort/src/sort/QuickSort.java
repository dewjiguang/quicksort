package sort;

public class QuickSort {
	public static void sort(int i,int j,int[] arr) {
		int left =i;
		int right =j;
		if(i>j)
			return;
		int temp=arr[i];
		while(arr[i]!=arr[j]&&i<j) {
			while(i<j&&arr[j]>temp) {
				j--;
			}
			while(i<j&&arr[i]<temp) {
				i++;
			}
			
			int temp2=arr[i];
			arr[i]=arr[j];
			arr[j]=temp2;
		}
		int temp2=temp;
		temp=arr[j];
		arr[j]=temp2;
		sort(left,i-1,arr);
		sort(i+1,right,arr);
		
		
	}
	public static void maopaosort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	}
	public static int binarysearch(int[] arr,int a,int first,int last) {
		if((last-first)==1&&a!=arr[first])
			return -1;
		int binary=arr.length/2;
		if(a<arr[binary])
			binarysearch(arr,a,first,binary);
		if(a>arr[binary])
			binarysearch(arr,a,binary,last);
		if(arr[binary]==a)
			return binary;
		
		else
		
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,45,95,65,78,0,32,5};
//		sort(0,arr.length-1,arr);
		maopaosort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(binarysearch(arr,45,0,arr.length-1));
		System.out.println("做了更改");
	}

}
