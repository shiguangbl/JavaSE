package testThread;
class TestThread1
{
	public static void main(String[] args) 
	{
		Runner1 r = new Runner1();//�������Thread���� ������������new
//		Thread t1 = new Thread (r);//�˼������̬
//		t1.start();                //����һ���߳�
		r.start();
		for(int i=1;i<=100;i++){
			System.out.println("main1:"+i);
		}
	}
}
//class Runner1 implements Runnable//ʵ��Runnable�ӿ�
class Runner1 extends Thread//ע�͵�����һ���������̵߳ķ���������ʹ����һ�֣�������ӿ�
{
	public void run(){//�����Ǿ�̬
		for(int i=1;i<=100;i++){
			System.out.println("Runner1:"+i);
		}
	}
}
