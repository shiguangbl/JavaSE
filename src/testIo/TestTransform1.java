package testIo;

import java.io.*;

class  TestTransform1//���Ի�����
{
	public static void main(String[] args) 
	{
		try{
			OutputStreamWriter osw = new OutputStreamWriter(
			new FileOutputStream("F:/Java��Ƶ���ĵ�����/�½��ı��ĵ�.txt"));
			osw.write("����������");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("F:/Java��Ƶ���ĵ�����/�½��ı��ĵ�.txt",true)//����true�Ƕ�ԭ�ı����ݽ���׷��
				,"ISO8859_1");//��Ϊһ�ָ�ʽ ��������������ŷ����
			osw.write("����������");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
