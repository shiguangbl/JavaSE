package testThread;

class TestSycn implements Runnable//将自身对Runnable接口进行实现
{
	Timer timer = new Timer();//
	public static void main(String[] args) //TestSycn的第一个方法
	{
		TestSycn ts = new TestSycn();//造出TestSycn对象 其内部包含Timer对象
		Thread t1 = new Thread(ts);//同一个线程类被用来启动两个线程 并共用了同一个线程类对象
		Thread t2 = new Thread(ts);//《其构成了两个线程访问同一个线程类对象》即线程同步问题
		t1.setName("t1");//对线程t1起名字
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run(){                     //TestSycn的第二个方法 其是因为必须实现Runnable的接口
		timer.add(Thread.currentThread().getName());//currentThread()返回当前线程的对象 并且此方法为静态
	}
}
class Timer extends Thread//继承了Thread类 而Thread类已经实现了Runnable接口 这样定义一个线程类可暂不用对run方法进行重写
{
	public static int num = 0;
	public synchronized void add(String name){//关键字也可以放在方法的修饰符后 对当前方法的代码进行锁定
//		synchronized(this){//【重要】代码段加锁:当执行此段代码的过程中锁定当前线程类对象 一个线程在sleep过程中 另一个线程也无法对当前线程类对象的此段代码进行操作
		num++;//【注意】:加锁的是整个对象，并且一个对象仅能被加上一把锁，而实际效果是仅被加锁的那段代码不能被其他线程操作
	try{
		Thread.sleep(1);
		}catch(InterruptedException e){}
		System.out.println(name+"你是第"+num+"启动此线程");
	}
//	}
}
