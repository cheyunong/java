//4.复制文档：使用FileWriter类将一个Student.java文档复制到newstudent.txt文件中
package che.day13;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
public class Zy4 {
	public static void main(String[] args) throws IOException {
		Reader r=new FileReader("c:/Student.java");
		BufferedReader br=new BufferedReader(r);
		BufferedWriter bw=new BufferedWriter(new FileWriter("c:/newstdent.txt"));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
		}
		bw.close();
	}
}
