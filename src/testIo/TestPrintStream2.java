package testIo;
import java.io.*;

class TestPrintStream2
{
	public static void main(String[] args)
	{
	//	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String filename = args[0];//��run as��ѡ��Arguments ��������
	//	String filename = in.readLine();
		if(filename != null){
			list(filename,System.out);//F:/Java��Ƶ���ĵ�����/String����.java
		}
	}
	public static void list(String fis,PrintStream ps){//System.out�պ�ΪPrintStream����
		try{
				BufferedReader br = new BufferedReader(new FileReader(fis));
				String s = null;
				while((s = br.readLine())!= null)//BufferedReader�����з��� ��ȡһ������
				{
					ps.print(s);//PrintStream�ķ���  ��ӡ
				}
				br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
	}
}
