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
			Thread.sleep(10000);         //在哪个线程内调用此方法，就对哪个线程睡眠
		}catch(InterruptedException e){ }//捕获异常后没有处理 一般不推荐

		t.interrupt();                   //打断线程t
	}
}
class MyThread implements Runnable
{
	boolean flat = true;
	public void run(){
		while(flat){
			System.out.println("===="+new Date()+"====");//不能忘记加new
			try{                               //此异常无法在run方法中抛出，因为是重写Runnable的方法
				Thread.sleep(1000);
			}catch(InterruptedException e){
				flat = false;                  //相当于跳出了死循环
			}
		}
	}
}
