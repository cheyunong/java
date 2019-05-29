package che.day11;
import java.util.Arrays;
public class Zy1_1 {
	public static void bubble(int[] t) {
		boolean tag = true;
		for (int j = 0; j < t.length - 1; j++) {
			for (int i = 0; i < t.length - 1 - j; i++) {
				if (t[i] < t[i + 1]) {
					int temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
					tag = false;
				}
			}
			if (tag) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] t = { 3, 1, -2, 4, 9, -7, 6 };
		bubble(t);
		System.out.println(Arrays.toString(t));
	}
}
