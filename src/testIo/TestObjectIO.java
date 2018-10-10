package testIo;
import java.io.*;
class TestObjectIO//将整个对象作为一个整体进行存储
{
	public static void main(String[] args)throws Exception//抛出main函数异常
	{
		T t = new T();
		t.a=100;
		FileOutputStream fos = new FileOutputStream("F:/Java视频及文档资料/dat2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//处理流就为存储对象
		oos.writeObject(t);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("F:/Java视频及文档资料/dat2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T t2 = (T)ois.readObject();
		System.out.println(t2.a+" "+t2.b+" "+t2.s);//打印结果:保留了已修改的值 忽视了被隐形的值
		ois.close();
	}
}
class T implements Serializable//标记接口 即空接口
{
	int a = 5;
	transient int b = 8;//忽略b的内容
	String s = "sss";
}
