package testNet;
import java.io.*;
import java.net.*;
class TCPServer
{
	public static void main(String[] args)throws Exception 
	{
		ServerSocket ss = new ServerSocket(6665);//创建一个服务器 其端口为6665
		while(true){//使用while可以不停接收客户端
			Socket s = ss.accept();//此方法也为阻塞式  程序卡到此方法等待一个连接
			System.out.println("a client connect");
			DataInputStream dis = new DataInputStream(s.getInputStream());//将连进来的打上管道
			System.out.println(dis.readUTF());//读取写入进来的UTF字符
			dis.close();//关闭读入管道
			s.close();//关闭与客户端的连接
		}
	}
}
