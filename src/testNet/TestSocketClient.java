package testNet;

import java.io.*;
import java.net.*;
class TestSocketClient
{
	public static void main(String []args){
		InputStream in = null;
		OutputStream out = null;
		try{
			Socket ss = new Socket("192.168.1.100",16666);
			in = ss.getInputStream();
			out = ss.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("Hi");
			String s = null;
			if((s = dis.readUTF()) != null){
				System.out.println(s);
			}
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			}
	}
}