//4、编写买家与卖家交易的程序，一个钱锁，一个货锁，并造成死锁。
package che.day15;
class Business{
	private String name;
	public synchronized void hold(Business otherbusiness) {
		System.out.println(this.name+"拒绝了"+otherbusiness.name+"，等"+otherbusiness.name+"先给钱");
		otherbusiness.giveup();
	}
	public synchronized void giveup(){
		System.out.println(this.getName()+"放弃了坚持");
	}
	public Business(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
}
public class Zy4 {
	public static void main(String[] args) {
		Business b1=new Business("卖假钞的");
		Business b2=new Business("买假钞的");
		Thread t1=new Thread(()->{b1.hold(b2);});
		Thread t2=new Thread(()->{b2.hold(b1);});
		t1.start();
		t2.start();
	}
}
