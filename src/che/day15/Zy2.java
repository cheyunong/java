//2、编写两个线程，对同一个成员变量增加若干次（次数多一点），会出现什么情况。
package che.day15;
class Num{
	int i=0;
}
class CThread extends Thread{
	Num n;
	public CThread(Num n) {
		this.n = n;
	}
	public void run(){
		while(n.i<200) {
			System.out.println(Thread.currentThread().getName()+":"+(n.i++));
		}
	}	
}
public class Zy2 {
	public static void main(String[] args) {
		Num i=new Num();
		Thread t1=new CThread(i);
		Thread t2=new CThread(i);
		t1.start();
		t2.start();
	}
}
