package testIo;
import java.io.*;
class TestFileCopy 
{
	public static void main(String[] args) 
	{
		int b = 0;
		FileReader in = null;//节点流
		FileWriter out = null;
		try{
			in = new FileReader("F:/Java视频及文档资料/String方法.java");
			out = new FileWriter("d:/java/String方法.java");//要写清至 将要被传入的文档(可以不存在)
			while((b = in.read())!=-1){
				out.write(b);
			}
		    out.close();
		    in.close(); 
		}catch (FileNotFoundException e2){
			System.out.println("指定文件未找到");
			System.exit(-1);
		}catch (IOException e1){
			System.out.println("文件复制错误");
			System.exit(-1);
		}
		System.out.println("文件已被复制");
	}
}
