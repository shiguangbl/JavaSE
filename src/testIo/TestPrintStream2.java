package testIo;
import java.io.*;

class TestPrintStream2
{
	public static void main(String[] args)
	{
	//	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String filename = args[0];//在run as中选择Arguments 进行输入
	//	String filename = in.readLine();
		if(filename != null){
			list(filename,System.out);//F:/Java视频及文档资料/String方法.java
		}
	}
	public static void list(String fis,PrintStream ps){//System.out刚好为PrintStream类型
		try{
				BufferedReader br = new BufferedReader(new FileReader(fis));
				String s = null;
				while((s = br.readLine())!= null)//BufferedReader的特有方法 读取一行数据
				{
					ps.print(s);//PrintStream的方法  打印
				}
				br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
	}
}
