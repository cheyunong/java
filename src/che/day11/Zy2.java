package che.day11;
import java.util.ArrayList;
import java.util.List;
class Student{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class Zy2 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student("熊大",20);
		Student s2=new Student("熊二",18);
		Student s3=new Student("光头强",50);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Student student:list) {
			System.out.println("姓名："+student.name+"  年龄："+student.age);	
		}			
	}
}