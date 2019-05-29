package che.day10;
class Box<T>{
	private T width;
	private T height;
	public Box(T width, T height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + "]";
	}
}
public class Zy1 {
	public static void main(String[] args) {
		Integer i=1;
		Double d=2.0;
		String s="3";
		Box<Integer> integerBox=new Box<Integer>(i, i);
		Box<Double> doubleBox=new Box<Double>(d, d);
		Box<String> stringBox=new Box<String>(s, s);
		System.out.println(integerBox);
		System.out.println(doubleBox);
		System.out.println(stringBox);		
	}
}
