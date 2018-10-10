package testIo;

import java.io.*;

class  TestDateStream
{
	public static void main(String[] args) //为处理流的一种 可将基本类型数据不用转换为String类型 直接进行写入
	{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();//创建一个字节数组
		DataOutputStream dos = new DataOutputStream(bao);//给字节数组套上管道
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());//此方法返回值为byte数组 恰好满足构造方法
			System.out.println(bai.available());
			DataInputStream dis = new DataInputStream(bai);
			System.out.println(dis.readDouble());//遵循先进先出原则 (队列)  否则会出错
			System.out.println(dis.readBoolean());//
			dos.close();
			dis.close();
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
