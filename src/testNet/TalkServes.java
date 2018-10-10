package testNet;
import java.net.*;
import java.io.*;
class TalkServes
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(28888);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter osw = new PrintWriter(s.getOutputStream());
		BufferedReader isr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("有客户端连接");
		System.out.println(isr.readLine());	
		String line = br.readLine();
		while(!line.equalsIgnoreCase("bye")){
			osw.println(line);
			System.out.println(isr.readLine());
			line = br.readLine();
		}
		br.close();
		isr.close();
		osw.close();
		s.close();
	}
}
