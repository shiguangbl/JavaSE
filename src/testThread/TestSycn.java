package testThread;

class TestSycn implements Runnable//�������Runnable�ӿڽ���ʵ��
{
	Timer timer = new Timer();//
	public static void main(String[] args) //TestSycn�ĵ�һ������
	{
		TestSycn ts = new TestSycn();//���TestSycn���� ���ڲ�����Timer����
		Thread t1 = new Thread(ts);//ͬһ���߳��౻�������������߳� ��������ͬһ���߳������
		Thread t2 = new Thread(ts);//���乹���������̷߳���ͬһ���߳�����󡷼��߳�ͬ������
		t1.setName("t1");//���߳�t1������
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run(){                     //TestSycn�ĵڶ������� ������Ϊ����ʵ��Runnable�Ľӿ�
		timer.add(Thread.currentThread().getName());//currentThread()���ص�ǰ�̵߳Ķ��� ���Ҵ˷���Ϊ��̬
	}
}
class Timer extends Thread//�̳���Thread�� ��Thread���Ѿ�ʵ����Runnable�ӿ� ��������һ���߳�����ݲ��ö�run����������д
{
	public static int num = 0;
	public synchronized void add(String name){//�ؼ���Ҳ���Է��ڷ��������η��� �Ե�ǰ�����Ĵ����������
//		synchronized(this){//����Ҫ������μ���:��ִ�д˶δ���Ĺ�����������ǰ�߳������ һ���߳���sleep������ ��һ���߳�Ҳ�޷��Ե�ǰ�߳������Ĵ˶δ�����в���
		num++;//��ע�⡿:���������������󣬲���һ��������ܱ�����һ��������ʵ��Ч���ǽ����������Ƕδ��벻�ܱ������̲߳���
	try{
		Thread.sleep(1);
		}catch(InterruptedException e){}
		System.out.println(name+"���ǵ�"+num+"�������߳�");
	}
//	}
}
