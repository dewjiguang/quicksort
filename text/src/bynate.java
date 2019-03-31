
public class bynate {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 23, 45, 67, 89, 123, 345, 457, 679, 890 };
		binarySerach(a, 89);
	}

	public static void binarySerach(int[] a, int b) {
		int left = 0;
		int fund = -1;
		int right = a.length - 1;
		while (left <= right) {
			int mid = left + right;
			if (a[mid] < b)
				left = mid + 1;
			else if (a[mid] > b)
				right = mid - 1;
			else if (a[mid] == b) {

				fund = mid;
				break;
			}
		}
		System.out.println(fund);

	}

}
