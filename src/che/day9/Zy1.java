package che.day9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Zy1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date begin=sdf.parse("1994-03-15 00:00:00");
		java.util.Date end=sdf.parse("2019-04-17 00:00:00");
		long between=(end.getTime()-begin.getTime())/1000;
		long day=between/(24*60*60);
		System.out.println("来到世界"+day+"天");
	}
}

