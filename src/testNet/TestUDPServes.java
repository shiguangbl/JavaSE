package testNet;

import java.net.*;
class TestUDPServes//UDP��  ��  ��  �Ĺ����б�����ϰ�  ���յ��������ȱ���װ��
{
	public static void main(String[] args) throws Exception
	{
		byte buf[] = new byte[2014];//����һ��byte����
		DatagramPacket dp = new DatagramPacket(buf,buf.length);//����һ�����ݰ���Ŀ��Ϊ��byte����������а�װ
		DatagramSocket ds = new DatagramSocket(8667);//��������8667�˿��ϼ���
		while(true){
			ds.receive(dp);//���ձ���װ�õİ���dp
			System.out.println(new String(buf,0,dp.getLength()));//���յ��İ����ڵ�����ת��ΪString���ͽ��д�ӡ����
		}
	}
}
