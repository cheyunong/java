package che.day9;
import java.util.Scanner;
class scoreException extends Exception{
	public scoreException(){}
	public scoreException(String message){
		super(message);
	}
}
class Score{
	private int score;
	public void setScore(int score) throws scoreException {
		if(score>=0&score<=100) {
		this.score = score;
		System.out.println("输入成功");
		}else {
			throw new scoreException("输入有误");
		}
	}
	public int getScore() {
		System.out.println("输入分数为："+score);
		return score;
	} 
}
public class Zy3 {
	public static void main(String[] args){
		Score s=new Score();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个分数：");
		try {
			s.setScore(sc.nextInt());
		} catch (scoreException e) {
			System.out.println("");
			e.printStackTrace();
			return;
		}
		s.getScore();
	}
}