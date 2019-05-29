/*第二十四章 网络编程
 * 一、网络基础
 * 1.计算机网络
 * 将地理位置不同的，具有独立功能的多台计算机和外部设备，通过通信线路连接在一起，为了实现信息和资源的共享
 * 如果没有计算机网络，只能通过硬件设备完成信息的共享
 * 2.通信协议
 * 七层结构：
 * 应用层  表示层  会话层  传输层  网络层  数据链路层  物理层 
 * 计算机通信协议：就是网络中计算机之间，计算机网络结构之间传输数据的规范 
 * 网络协议涉及到的三个要素：
 * 语义：用来解释哪一段是用来干什么的，要做什么
 * 语法：要怎么做
 * 时序：表示做的顺序
 * HTTP：超文本传输协议
 * IP  ：计算机地址           端口号：每个计算机程序都会占用的一个端口号
 * TCP ：传输控制协议       点对点的协议
 * UDP ：数据报协议           无连接协议
 * FTP ：文件传输协议       
 * 3.URL 统一资源定位
 * 是一个字符串序列，包含两个部分
 * （1）协议标识符
 * （2）资源名称：可以分为主机名称、端口号、文件名（路径）、相关引用
 * 使用java解析URL：
 * URL类（和包装器类很像，非可变类）：可以创建URL对象，需要解析哪个URL，则需要先使用URL类
 * 
 * 
 * 
 * 二、套接字编程
 * 网络是两个程序(客户端、服务端)互相建立沟通或者连接
 * Socket  ServerSocket
 * 
 * 两个重要协议：
 * TCP：一个点连接另外一个点之间的协议（确定的某个端口到确定的另外一个端口）
 *               分为三次握手：
 *               客户端
 *准确、安全、可靠	
 * UDP：不安全，不可靠，无连接协议
 * 速度快
 * 即时消息
 * 统计丢包率
 * 
 * 
 * 使用套接字来对TCP进行套接字编程
 * （1）先获得socket对象
 * 
 */
package che.day16;
public class LX {
	public static void main(String[] args) {
		
	}
}