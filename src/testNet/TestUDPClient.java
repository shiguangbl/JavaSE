package testNet;

import java.net.*;
class TestUDPClient//相同地先把数据以某种格式进行打包
{
	public static void main(String[] args) throws Exception
	{
		byte buf[] = (new String("Hello")).getBytes();//将一个字符串分成byte数组
		DatagramPacket dp = new DatagramPacket(buf,buf.length,//发送前的包装，内部包含服务器端的地址和端口
												new InetSocketAddress("223.89.95.220",8667));
		DatagramSocket ds = new DatagramSocket(8666);//自身的端口
		while(true){
			ds.send(dp);//将包裹dp发送
			ds.close();
		}
	}
}
