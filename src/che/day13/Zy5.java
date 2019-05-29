//5.使用PrintWriter a.txt文本文件中写入内容
package che.day13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
public class Zy5 {
	public static void main(String[] args) throws IOException {
		Reader r=new FileReader("c:/Student.java");
		BufferedReader br=new BufferedReader(r);
		PrintWriter bw=new PrintWriter("c:/a.txt");
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
		}
		bw.close();
	}
}
