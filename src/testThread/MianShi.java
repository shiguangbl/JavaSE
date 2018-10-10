package testThread;
//【重要】代码段加锁:当执行此段代码的过程中锁定当前线程类对象 一个线程在sleep过程中 另一个线程也无法对当前线程类对象的此段代码进行操作
//【注意】:加锁的是整个对象，并且一个对象仅能被加上一把锁，而实际效果是仅被加锁的那段代码不能被其他线程操作
class MianShi implements Runnable 
{
	int b = 100;
	public synchronized void ms1()throws Exception{//同时加上synchronized的两个方法再也无法被同时执行，因为同一个对象在相时间段内仅能上一把锁
		b = 1000;                                  //在一把锁打开后才能上另一把锁
		Thread.sleep(5000);
		System.out.println("b ="+b);
	}
	public synchronized void ms2()throws Exception{//正确的上锁方法:已上锁的方法内包含的共享资源 b 在其他包含修改b的方法也要加锁，否则出现前后不一致问题 
		Thread.sleep(2500);//【解释】前后不一样问题:是针对一个方法的内部来讲的(方法内前面赋给的值与其在方法内后边输出的结果不一致)
		b = 2000;
	}
//	public void ms2(){//虽然ms1方法已经把此线程类对象上锁，但是此方法不在加锁代码范围内，所以能被其他线程进行执行
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
