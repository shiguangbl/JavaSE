package testThread;

import java.util.*;
class TestInterrupt
{
	public static void main(String[] args) 
	{
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		try{
			Thread.sleep(10000);         //���ĸ��߳��ڵ��ô˷������Ͷ��ĸ��߳�˯��
		}catch(InterruptedException e){ }//�����쳣��û�д��� һ�㲻�Ƽ�

		t.interrupt();                   //����߳�t
	}
}
class MyThread implements Runnable
{
	boolean flat = true;
	public void run(){
		while(flat){
			System.out.println("===="+new Date()+"====");//�������Ǽ�new
			try{                               //���쳣�޷���run�������׳�����Ϊ����дRunnable�ķ���
				Thread.sleep(1000);
			}catch(InterruptedException e){
				flat = false;                  //�൱����������ѭ��
			}
		}
	}
}
