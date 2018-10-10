package testThread;

class TestYield//对yield方法的测试
{
	public static void main(String[] args) 
	{
		MyThread3 mt1 = new MyThread3("t1");
		MyThread3 mt2 = new MyThread3("t2");
		mt1.start();
		mt2.start();
	}
}	
class MyThread3 extends Thread
{
	MyThread3(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+":"+i);
			if(i%10==0){//遇上10的倍数就暂停当前线程
				yield();//暂停当前正在执行的线程对象，并执行其他线程 
			}
		}
	}
}