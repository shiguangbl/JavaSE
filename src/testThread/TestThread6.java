package testThread;

public class TestThread6 {	//����isAlive()
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
		System.out.println(Thread.currentThread().isAlive());//Thread.currentThread()�൱��this ����˭��ִ�д�run�����Ǹ��߳�
		for(int i=0;i<50;i++) {
			System.out.println("SubThread: " + i);
		}
	}
}