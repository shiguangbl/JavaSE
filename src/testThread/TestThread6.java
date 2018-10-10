package testThread;

public class TestThread6 {	//测试isAlive()
	public static void main(String args[]){
		Thread t = new Runner6();
		t.start();
		
		for(int i=0; i<50; i++) {
			System.out.println("MainThread: " + i);
		}
  }
}

class Runner6 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().isAlive());//Thread.currentThread()相当于this 返回谁在执行此run方法那个线程
		for(int i=0;i<50;i++) {
			System.out.println("SubThread: " + i);
		}
	}
}