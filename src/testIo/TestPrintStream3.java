package testIo;
import java.io.*;
import java.util.*;
class TestPrintStream3
{
	public static void main(String[] args)
	{
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		try{//System.in�ķ������ͺ�InputStreamReader�Ĺ�������һ�� ��ΪInputStream����
			String s = null;
			FileWriter fw = new FileWriter("F:/Java��Ƶ���ĵ�����/dat.txt",true);
			PrintWriter pw = new PrintWriter(fw);//�����ݴ�ӡ(��)�����ܵ���fw��
			while((s = bw.readLine()) != null){
				if(s.equalsIgnoreCase("exit")){ break; }
				System.out.println(s.toUpperCase());
				pw.println(s.toUpperCase());//����write ��Ϊwrite�޷�����
				pw.flush();//��ʡ��  Print������Զ�flush
			}
			pw.println("===="+new Date()+"====");//����Date�� ��ʾʱ��
			pw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
