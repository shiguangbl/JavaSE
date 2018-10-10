package testThread;

class TestJoin
{
	public static void main(String[] args) 
	{
		MyThread2 mt1 = new MyThread2("t1");
		mt1.start();
		try{
			mt1.join();   //���߳�mt1�ϲ�����߳�  ����Ҫ��mt1���н������ܼ�������ִ��
		}catch(InterruptedException e){//��һ˵��  �ȴ����߳�mt1��ֹ
			System.out.println("error");
		}
		for(int i=0;i<10;i++){
			System.out.println("i am main:"+i);
		}
	}	
}
class MyThread2 extends Thread
{
	MyThread2(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("i am"+getName()+":"+i);
			try{
				sleep(1000);
			}catch(InterruptedException e){
				return;
			}
		}
	}
}

