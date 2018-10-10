package testIo;
import java.io.*;
class TestBufferStream2
{
	public static void main(String[] args)// Buffered流是缓冲流 
	{
		try{
			BufferedReader in = new BufferedReader(new FileReader("F:/Java视频及文档资料/String方法.java"));//读出此文件并按行输出
			BufferedWriter out = new BufferedWriter(new FileWriter("d:/java/String方法.java"));//写入10个随机数并创建或替换文件
			String s = null;
			for(int i=1;i<=10;i++){
				s = String.valueOf(Math.random());
				out.write(s);
				out.newLine();
			}
			out.flush();
			while((s = in.readLine())!=null){//readLine()读取结束时  返回值为null
				System.out.println(s);
			}
			out.close();
			in.close();
		}catch (IOException e1){
			System.out.println("error");
			System.exit(-1);
		}
	}
}
