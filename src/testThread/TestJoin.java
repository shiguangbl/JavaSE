package testThread;

class TestJoin
{
	public static void main(String[] args) 
	{
		MyThread2 mt1 = new MyThread2("t1");
		mt1.start();
		try{
			mt1.join();   //将线程mt1合并入此线程  但是要等mt1运行结束才能继续向下执行
		}catch(InterruptedException e){//另一说法  等待该线程mt1终止
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

