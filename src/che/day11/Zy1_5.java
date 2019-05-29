package che.day11;
import java.util.Arrays;
public class Zy1_5 {
	public static void binarySearch(int[] t, int key) {
		Arrays.sort(t);
		int start = 0;
		int end = t.length - 1;
		boolean tag = true;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == t[mid]) {
				System.out.println("找到了");
				tag = false;
				break;
			} else if (key < t[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (tag) {
			System.out.println("该值不存在");
		}
	}
	public static void main(String[] args) {
		int[] t = { 3, 1, -2, 4, 9, -7, 6 };
		binarySearch(t, 9);
	}
}
