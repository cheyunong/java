package che.day11;
import java.util.Arrays;
public class Zy1_2 {
	public static void choose(int[]t) {
		for(int j=0;j<t.length-1;j++) {
			int max_index=j;
			for(int i=j+1;i<t.length;i++) {
				if(t[max_index]<t[i]) {
					max_index=i;
				}
			}
			int temp=t[j];
			t[j]=t[max_index];
			t[max_index]=temp;
		}
	}
	public static void main(String[] args) {
		int[] t = { 3, 1, -2, 4, 9, -7, 6 };
		choose(t);
		System.out.println(Arrays.toString(t));
	}
}
