package che.day12;
import java.util.HashSet;
import java.util.Set;
class Mouse{
	private String name;
	private int num;
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
	public Mouse(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouse other = (Mouse) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mouse [老鼠名字=" + name + ", 老鼠编号=" + num + "]";
	}
}
public class Zy2 {
	public static void main(String[] args) {
		Set<Mouse> set=new HashSet<Mouse>();
		Mouse m1=new Mouse("仓鼠", 1);
		Mouse m2=new Mouse("田鼠", 2);
		Mouse m3=new Mouse("鼹鼠", 3);
		Mouse m4=new Mouse("竹鼠", 4);
		Mouse m5=new Mouse("竹鼠", 4);//m4和m5相同名字，输出时只会输出一个
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		System.out.println(set);
	}
}
