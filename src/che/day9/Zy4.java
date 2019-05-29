package che.day9;
import java.util.Scanner;
class Triangle{
	int a;
	int b;
	int c;
	public void isTriangle(int a,int b,int c) throws scoreException {
		if(a+b>c&a+c>b&&b+c>a){
			System.out.println("三个边长分别为："+a+","+b+","+c);
		}else {
			throw new scoreException("输入有误");
		}
	}
}
public class Zy4 {
	public static void main(String[] args) throws IllegalArgumentException{
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个边长数据：");
		try {
			t.isTriangle(sc.nextInt(), sc.nextInt(), sc.nextInt());
		} catch (scoreException e) {
			System.out.println("a,b,c不能构成三角形");
			e.printStackTrace();
		}
	}
}