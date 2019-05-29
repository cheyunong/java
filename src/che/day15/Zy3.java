//3、编写两个线程，对同一个局部变量增加若干次（次数多一点），会出现什么情况。
package che.day15;
class CRunnable implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<=500){
			System.out.println(Thread.currentThread().getName()+":"+(i++));
		}
	}	
}
public class Zy3 {	
	public static void main(String[] args) {
		Runnable r=new CRunnable();
		Thread t1=new Thread(r,"A");
		Thread t2=new Thread(r,"B");
		t1.start();
		t2.start();
	}
}
