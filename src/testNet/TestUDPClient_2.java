package testNet;

import java.net.*;
import java.io.*;
class TestUDPClient_2
{
	public static void main(String[] args) throws Exception
	{
		long l = 10000l;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();//����һ���ֽ�����
		DataOutputStream dos = new DataOutputStream(bos);//Ϊ�ֽ�������Ϲܵ�
		dos.writeLong(l);//���Ϲܵ���ķ��� ����һ��long���͵���д��
		byte buf[] = bos.toByteArray();//���ֽ�����ת��Ϊ�������ֽ�����
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
