package testNet;
import java.net.*;
import java.io.*;
class TalkClient 
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.1.100",28888);
		System.out.println("ÒÑÁ¬½Ó");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter osw = new PrintWriter(s.getOutputStream());
		String line = br2.readLine();
		while(!line.equalsIgnoreCase("byebye")){
			osw.println(line);
			System.out.println(br.readLine());
			line = br2.readLine();
		}
		br.close();
		br2.close();
		osw.close();
	}
}
