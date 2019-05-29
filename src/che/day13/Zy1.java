//1.利用集合和递归，写出快速排序
package che.day13;
public class Zy1 {
	public static void main(String[] args) {
		int[] array = { 3, 12, -5, -44, 2, 4, 0 };
		quickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static void quickSort(int[] n, int left, int right) {
		int pivot;
		if (left < right) {
			pivot = partition(n, left, right);
			quickSort(n, left, pivot - 1);
			quickSort(n, pivot + 1, right);
		}
	}
	public static int partition(int[] n, int left, int right) {
		int pivotkey = n[left];
		while (left < right) {
			while (left < right && n[right] >= pivotkey)
				--right;
			n[left] = n[right];
			while (left < right && n[left] <= pivotkey)
				++left;
			n[right] = n[left];
		}
		n[left] = pivotkey;
		return left;
	}
}