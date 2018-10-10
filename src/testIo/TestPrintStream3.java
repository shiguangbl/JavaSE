package testIo;
import java.io.*;
import java.util.*;
class TestPrintStream3
{
	public static void main(String[] args)
	{
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		try{//System.in的返回类型和InputStreamReader的构造类型一致 均为InputStream类型
			String s = null;
			FileWriter fw = new FileWriter("F:/Java视频及文档资料/dat.txt",true);
			PrintWriter pw = new PrintWriter(fw);//将内容打印(如)到“管道”fw内
			while((s = bw.readLine()) != null){
				if(s.equalsIgnoreCase("exit")){ break; }
				System.out.println(s.toUpperCase());
				pw.println(s.toUpperCase());//不用write 因为write无法换行
				pw.flush();//可省略  Print本身会自动flush
			}
			pw.println("===="+new Date()+"====");//引用Date类 显示时间
			pw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
