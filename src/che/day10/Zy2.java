package che.day10;
import java.util.Arrays;
class Vip implements Comparable<Vip>{
	private String name;
	private int num;
	private int point;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Vip(String name, int num, int point) {
		super();
		this.name = name;
		this.num = num;
		this.point = point;
	}
	@Override
	public int compareTo(Vip arg0) {
		if(this.point>arg0.point)
			return -1;
		else if(this.point<arg0.point)
			return 1;
		else
		return 0;
	}
	@Override
	public String toString() {
		return "Vip [姓名：" + name + ", 年龄：" + num + ", 积分：" + point + "]";
	}
}
public class Zy2 {
	public static void main(String[] args) {		
		Vip vip1=new Vip("张三", 18, 900);
		Vip vip2=new Vip("李四", 20, 850);
		Vip vip3=new Vip("王五", 33, 1300);
		Vip vip4=new Vip("赵六", 30, 1000);
		Vip[] vip=new Vip[]{vip1,vip2,vip3,vip4};
		Arrays.sort(vip);
		System.out.println(Arrays.toString(vip));
	}
}