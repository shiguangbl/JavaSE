package testNet;

import java.net.*;
class TestUDPClient//��ͬ���Ȱ�������ĳ�ָ�ʽ���д��
{
	public static void main(String[] args) throws Exception
	{
		byte buf[] = (new String("Hello")).getBytes();//��һ���ַ����ֳ�byte����
		DatagramPacket dp = new DatagramPacket(buf,buf.length,//����ǰ�İ�װ���ڲ������������˵ĵ�ַ�Ͷ˿�
												new InetSocketAddress("223.89.95.220",8667));
		DatagramSocket ds = new DatagramSocket(8666);//����Ķ˿�
		while(true){
			ds.send(dp);//������dp����
			ds.close();
		}
	}
}
