package testIo;
import java.io.*;
class TestObjectIO//������������Ϊһ��������д洢
{
	public static void main(String[] args)throws Exception//�׳�main�����쳣
	{
		T t = new T();
		t.a=100;
		FileOutputStream fos = new FileOutputStream("F:/Java��Ƶ���ĵ�����/dat2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//��������Ϊ�洢����
		oos.writeObject(t);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("F:/Java��Ƶ���ĵ�����/dat2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T t2 = (T)ois.readObject();
		System.out.println(t2.a+" "+t2.b+" "+t2.s);//��ӡ���:���������޸ĵ�ֵ �����˱����ε�ֵ
		ois.close();
	}
}
class T implements Serializable//��ǽӿ� ���սӿ�
{
	int a = 5;
	transient int b = 8;//����b������
	String s = "sss";
}
