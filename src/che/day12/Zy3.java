package che.day12;
import java.util.HashMap;
public class Zy3 {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("CN", "中国");
		hm.put("US", "美国");
		hm.put("UK", "英国");
		hm.put("FR", "法国");
		hm.put("RF", "俄国");
		hm.forEach((k,v)->System.out.println(k+":"+v));
	}
}
