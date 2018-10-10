package testIo;

import java.io.*;
class TestPrintStream1
{
	public static void main(String[] args) 
	{
		PrintStream ps = null;//此流不用抛异常  处理流
		try{
			FileOutputStream fos = new FileOutputStream("F:/Java视频及文档资料/6万种字符.txt");
			ps = new PrintStream(fos);

		}catch(IOException e){
			e.printStackTrace();
		}
		if(ps !=null){
			System.setOut(ps);
		}
		int k = 0;
		for(char i=0;i<=60000;i++){
			System.out.print(i+" ");
			if(++k>=100){
				System.out.println();
				k = 0;
			}
		}
	}
}
