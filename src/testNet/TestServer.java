package testNet;
import java.io.*;
import java.net.*;
class TestServer
{
	public static void main(String[] args) 
	{
		try{
		ServerSocket ss = new ServerSocket(8888);
			while(true){
				Socket s = ss.accept();
				OutputStream is = s.getOutputStream();
				DataOutputStream dis = new DataOutputStream(is);
				dis.writeUTF("Adress:"+s.getInetAddress()+" "+"port:"+s.getPort());
				dis.close();
				s.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}