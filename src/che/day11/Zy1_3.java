package che.day11;
import java.util.Arrays;
public class Zy1_3 {
public static void insert(int[] t) {
	for(int i=1;i<t.length;i++) {
		int temp=t[i];
		int j=i-1;
		while(j>=0&&temp>t[j]) {
			t[j+1]=t[j];
			j--;
		}
		t[j+1]=temp;
	}
}
	public static void main(String[] args) {
		int[] t = { 3, 1, -2, 4, 9, -7, 6 };
		insert(t);
		System.out.println(Arrays.toString(t));
	}
}
