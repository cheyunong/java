package che.day12;

public class Zy1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
/*1.Arraylist和Linkedlist 区别和联系
对象下的方法几乎完全一致，但是底层存储不同：
ArrayList是动态数组，LinkedList是链表；
ArrayList适合做查询，LinkedList适合做添加和删除，不适合做查询。
2.HashSet和ArrayList相比区别
ArrayList可以重复引用，HashSet不会重复复存放；
ArrayList是有序存放，HashSet是否有序取决于实现类；
没有排序时，ArrayList会按输入的顺序输出，HashSet输出时是无序的。
3.HashSet和HashMap的区别
HashMap实现了Map接口，HashSet实现了Set接口；
HashMap存储键值对，HashSet仅储存对象；
HashMap使用put方法将元素存放在map中，HashSet使用add将元素放在Set中；
HashMap比较快，使用唯一的键来获取对象，HashSet相比慢一些；
HashMap使用键对象来计算hashcode值，HashSet使用成员对象计算hashcode值。
*/