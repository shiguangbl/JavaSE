package testNet;

import java.net.*;
import java.io.*;
class TestUDPClient_2
{
	public static void main(String[] args) throws Exception
	{
		long l = 10000l;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();//创造一个字节数组
		DataOutputStream dos = new DataOutputStream(bos);//为字节数组加上管道
		dos.writeLong(l);//加上管道后的方法 即将一个long类型的数写入
		byte buf[] = bos.toByteArray();//将字节数组转换为真正的字节数组
//		System.out.println(buf.length);
		DatagramPacket dp = new DatagramPacket(buf,buf.length,
												new InetSocketAddress("192.168.0.102",8668));
		DatagramSocket ds = new DatagramSocket(8666);
		while(true){
			ds.send(dp);
			ds.close();
		}
	}
}
