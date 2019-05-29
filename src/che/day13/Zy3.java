//3.使用FileWriter将字符串“好好学习Java”写入写数据到haha.txt中
package che.day13;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Zy3 {
	public static void main(String[] args) {
		try(Writer w=new FileWriter("c:/haha.txt")){
			w.write("好好学习java");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
