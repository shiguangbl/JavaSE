package testIo;

import java.io.*;

class  TestTransform1//测试缓冲流
{
	public static void main(String[] args) 
	{
		try{
			OutputStreamWriter osw = new OutputStreamWriter(
			new FileOutputStream("F:/Java视频及文档资料/新建文本文档.txt"));
			osw.write("缓冲流测试");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("F:/Java视频及文档资料/新建文本文档.txt",true)//加上true是对原文本内容进行追加
				,"ISO8859_1");//此为一种格式 包含几乎所有西欧语言
			osw.write("缓冲流测试");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
