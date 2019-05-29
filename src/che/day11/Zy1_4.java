package che.day11;
import java.util.Arrays;
public class Zy1_4 {
	public static void shell(int[] t,int[] increment) {
		for (int in:increment) {
			for(int k=0;k<in;k++) {
				for(int i=k+1;i<t.length;i+=in) {
					int temp=t[i];
					int j=i-in;
					while(j>=0&&temp>t[j]) {
						t[j+in]=t[j];
						j-=in;
					}
					t[j+in]=temp;
					System.out.println(Arrays.toString(t));//详细交换过程
				}
			}			
		}
	}
	public static void main(String[] args) {
		int[] t = { 3, 1, -2, 4, 9, -7, 6 };
		shell(t,new int[] {3,2,1});
		System.out.println(Arrays.toString(t));//直接输出交换结果
	}
}