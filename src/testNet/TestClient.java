package testNet;
import java.io.*;
import java.net.*;
public class TestClient{
	public static void main(String[] args)
	{
		try{
			Socket s = new Socket("192.168.1.100",8888);
			InputStream os = s.getInputStream();
			DataInputStream dos = new DataInputStream(os);
			System.out.println(dos.readUTF());
			dos.close();
			s.close();
		}catch(ConnectException ce){
			System.out.println("服务器连接失败");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
