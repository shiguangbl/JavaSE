package testNet;
import java.io.*;
import java.net.*;
class TCPServer
{
	public static void main(String[] args)throws Exception 
	{
		ServerSocket ss = new ServerSocket(6665);//����һ�������� ��˿�Ϊ6665
		while(true){//ʹ��while���Բ�ͣ���տͻ���
			Socket s = ss.accept();//�˷���ҲΪ����ʽ  ���򿨵��˷����ȴ�һ������
			System.out.println("a client connect");
			DataInputStream dis = new DataInputStream(s.getInputStream());//���������Ĵ��Ϲܵ�
			System.out.println(dis.readUTF());//��ȡд�������UTF�ַ�
			dis.close();//�رն���ܵ�
			s.close();//�ر���ͻ��˵�����
		}
	}
}
