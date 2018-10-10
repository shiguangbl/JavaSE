package testNet;
import java.io.*;
import java.net.*;
class TestUDPServes_2
{
	public static void main(String[] args) throws Exception
	{
		byte buf[] = new byte[2014];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		DatagramSocket ds = new DatagramSocket(8668);
		while(true){
			ds.receive(dp);
			ByteArrayInputStream bis = new ByteArrayInputStream(buf);//为接进来的数组创建读入字节数组
			DataInputStream dis = new DataInputStream(bis);//加上管道
			System.out.println(dis.readLong());//管道的方法 即以long类型读取
		}
	}
}
