package testThread;
class TestThread1
{
	public static void main(String[] args) 
	{
		Runner1 r = new Runner1();//本身就是Thread对象 即不用再重新new
//		Thread t1 = new Thread (r);//此间包含多态
//		t1.start();                //启动一个线程
		r.start();
		for(int i=1;i<=100;i++){
			System.out.println("main1:"+i);
		}
	}
}
//class Runner1 implements Runnable//实现Runnable接口
class Runner1 extends Thread//注释的是另一种启动新线程的方法，尽量使用另一种，其包含接口
{
	public void run(){//不能是静态
		for(int i=1;i<=100;i++){
			System.out.println("Runner1:"+i);
		}
	}
}
