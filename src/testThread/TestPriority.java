package testThread;
class TestPriority
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new MyT1());
		Thread t2 = new Thread(new MyT2());
		t1.setPriority(Thread.NORM_PRIORITY+3);//给t1的优先级加3
		t1.start();
		t2.start();
	}
}
class MyT1 implements Runnable
{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("t1:"+i);
		}
	}
}
class MyT2 implements Runnable
{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("===t2:"+i);
		}
	}
}


