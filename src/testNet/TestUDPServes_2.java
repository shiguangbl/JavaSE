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
			ByteArrayInputStream bis = new ByteArrayInputStream(buf);//Ϊ�ӽ��������鴴�������ֽ�����
			DataInputStream dis = new DataInputStream(bis);//���Ϲܵ�
			System.out.println(dis.readLong());//�ܵ��ķ��� ����long���Ͷ�ȡ
		}
	}
}
