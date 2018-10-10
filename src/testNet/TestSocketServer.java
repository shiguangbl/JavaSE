package testNet;
import java.io.*;
import java.net.*;
class TestSocketServer
{
	public static void main(String []args){
		InputStream in = null;
		OutputStream out = null;
//		while(true){
			try{
				ServerSocket ss = new ServerSocket(16666);
				Socket socket = ss.accept();
				in = socket.getInputStream();
				out = socket.getOutputStream();
				DataInputStream dis = new DataInputStream(in);
				DataOutputStream dos = new DataOutputStream(out);
				String s = null;
				if((s = dis.readUTF()) != null){
					System.out.println(s);
					System.out.println("from:"+socket.getInetAddress());
					System.out.println("port"+socket.getPort());
				}
				dos.writeUTF("hellow");
			}catch(IOException e){
				e.printStackTrace();
			}
//		}
	}
}

