package testNet;
import java.net.*;
import java.io.*;
class TCPClient
{
	public static void main(String[] args)throws Exception 
	{
		Socket s = new Socket("192.168.1.100",6665);//����һ���ͻ��� ���ӵ�ָ�������� ��ַ+�˿�
		System.out.println("has connected");
		OutputStream os = s.getOutputStream();//Ϊд�����Ϲܵ�
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("hello Server");//д���ַ���
		dos.flush();//д����flush����  ����û�д˷���
		dos.close();//�رմ���ܵ�
		s.close();//�ر���ͻ��˵�����
	}
}
