package testIo;
import java.io.*;
class TestBufferStream2
{
	public static void main(String[] args)// Buffered���ǻ����� 
	{
		try{
			BufferedReader in = new BufferedReader(new FileReader("F:/Java��Ƶ���ĵ�����/String����.java"));//�������ļ����������
			BufferedWriter out = new BufferedWriter(new FileWriter("d:/java/String����.java"));//д��10����������������滻�ļ�
			String s = null;
			for(int i=1;i<=10;i++){
				s = String.valueOf(Math.random());
				out.write(s);
				out.newLine();
			}
			out.flush();
			while((s = in.readLine())!=null){//readLine()��ȡ����ʱ  ����ֵΪnull
				System.out.println(s);
			}
			out.close();
			in.close();
		}catch (IOException e1){
			System.out.println("error");
			System.exit(-1);
		}
	}
}
