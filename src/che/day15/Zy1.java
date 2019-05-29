//1、当创建一个线程时，该线程是前台线程还是后台线程？
package che.day15;
class Air extends Thread{
	public void run() {
		System.out.println("空调启动");//后台线程
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("空调正在吹风。。。");
		System.out.println("空调正在吹风。。。");
		System.out.println("空调关闭");
	}
} 
public class Zy1 {
	public static void main(String[] args) {
		Air a=new Air();
		a.setDaemon(true);//把Air声明成后台
		a.start();
		System.out.println("开始上班");//前台线程
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("下班啦~");
	}
}
