package testIo;

import java.io.*;

class  TestDateStream
{
	public static void main(String[] args) //Ϊ��������һ�� �ɽ������������ݲ���ת��ΪString���� ֱ�ӽ���д��
	{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();//����һ���ֽ�����
		DataOutputStream dos = new DataOutputStream(bao);//���ֽ��������Ϲܵ�
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());//�˷�������ֵΪbyte���� ǡ�����㹹�췽��
			System.out.println(bai.available());
			DataInputStream dis = new DataInputStream(bai);
			System.out.println(dis.readDouble());//��ѭ�Ƚ��ȳ�ԭ�� (����)  ��������
			System.out.println(dis.readBoolean());//
			dos.close();
			dis.close();
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
