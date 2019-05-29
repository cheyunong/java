package che.day9;
import java.util.Scanner;
class InsufficientFundsError extends Exception{
	public InsufficientFundsError(){}
	public InsufficientFundsError(String message){
		super(message);
	}
}
public class Zy2 {
	public void regist(double num) throws InsufficientFundsError{
		double num1=1000;
		if(num<num1)
			System.out.println("交易成功，剩余余额："+(num1-num));
		else{
			System.out.println("余额不足");
			throw new InsufficientFundsError("出错了");
		}
	}
	public static void main(String[] args) {
		Zy2 d=new Zy2();
		Scanner sc=new Scanner(System.in);
		System.out.println("当前余额1000元，请输入取款金额：");
		try{
			d.regist(sc.nextDouble());
		}catch(InsufficientFundsError e){}
	}
}