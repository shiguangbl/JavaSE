package testIo;
import java.io.*;
class TestFileCopy 
{
	public static void main(String[] args) 
	{
		int b = 0;
		FileReader in = null;//�ڵ���
		FileWriter out = null;
		try{
			in = new FileReader("F:/Java��Ƶ���ĵ�����/String����.java");
			out = new FileWriter("d:/java/String����.java");//Ҫд���� ��Ҫ��������ĵ�(���Բ�����)
			while((b = in.read())!=-1){
				out.write(b);
			}
		    out.close();
		    in.close(); 
		}catch (FileNotFoundException e2){
			System.out.println("ָ���ļ�δ�ҵ�");
			System.exit(-1);
		}catch (IOException e1){
			System.out.println("�ļ����ƴ���");
			System.exit(-1);
		}
		System.out.println("�ļ��ѱ�����");
	}
}
