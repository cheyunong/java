package che.day11;
public class Zy1_6 {
	public static void main(String[] args) {
		int[] t = { 3, 1, -2, 4, 9, -7, 6 };
		int key = 6;
		boolean tag = true;
		for (int i = 0; i < t.length; i++) {
			if (key == t[i]) {
				System.out.println("找到了");
				tag = false;
				break;
			}
		}
		if (tag) {
			System.out.println("该值不存在");
		}
	}
}