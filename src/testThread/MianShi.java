package testThread;
//����Ҫ������μ���:��ִ�д˶δ���Ĺ�����������ǰ�߳������ һ���߳���sleep������ ��һ���߳�Ҳ�޷��Ե�ǰ�߳������Ĵ˶δ�����в���
//��ע�⡿:���������������󣬲���һ��������ܱ�����һ��������ʵ��Ч���ǽ����������Ƕδ��벻�ܱ������̲߳���
class MianShi implements Runnable 
{
	int b = 100;
	public synchronized void ms1()throws Exception{//ͬʱ����synchronized������������Ҳ�޷���ͬʱִ�У���Ϊͬһ����������ʱ����ڽ�����һ����
		b = 1000;                                  //��һ�����򿪺��������һ����
		Thread.sleep(5000);
		System.out.println("b ="+b);
	}
	public synchronized void ms2()throws Exception{//��ȷ����������:�������ķ����ڰ����Ĺ�����Դ b �����������޸�b�ķ���ҲҪ�������������ǰ��һ������ 
		Thread.sleep(2500);//�����͡�ǰ��һ������:�����һ���������ڲ�������(������ǰ�渳����ֵ�����ڷ����ں������Ľ����һ��)
		b = 2000;
	}
//	public void ms2(){//��Ȼms1�����Ѿ��Ѵ��߳���������������Ǵ˷������ڼ������뷶Χ�ڣ������ܱ������߳̽���ִ��
//		System.out.println(b);
//	}
	public void run(){
		try{
			ms1();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception
	{
		MianShi ms = new MianShi();
		Thread t = new Thread(ms);
		t.start();

//		Thread.sleep(1000);
		ms.ms2();
		System.out.println(ms.b);
	}
}
