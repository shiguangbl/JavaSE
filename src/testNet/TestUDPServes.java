package testNet;

import java.net.*;
class TestUDPServes//UDP在  收  发  的过程中必须打上包  即收到的数据先被包装好
{
	public static void main(String[] args) throws Exception
	{
		byte buf[] = new byte[2014];//构建一个byte数组
		DatagramPacket dp = new DatagramPacket(buf,buf.length);//定义一个数据包，目的为以byte类型数组进行包装
		DatagramSocket ds = new DatagramSocket(8667);//服务器在8667端口上监听
		while(true){
			ds.receive(dp);//接收被包装好的包裹dp
			System.out.println(new String(buf,0,dp.getLength()));//将收到的包裹内的数据转换为String类型进行打印出来
		}
	}
}
