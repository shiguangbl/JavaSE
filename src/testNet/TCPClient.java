package testNet;
import java.net.*;
import java.io.*;
class TCPClient
{
	public static void main(String[] args)throws Exception 
	{
		Socket s = new Socket("192.168.1.100",6665);//创建一个客户端 连接到指定服务器 地址+端口
		System.out.println("has connected");
		OutputStream os = s.getOutputStream();//为写出打上管道
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("hello Server");//写出字符串
		dos.flush();//写出有flush方法  读入没有此方法
		dos.close();//关闭传输管道
		s.close();//关闭与客户端的连接
	}
}
