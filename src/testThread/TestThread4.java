package testThread;

class TestThread4
{
	public static void main(String[] args) //�߳�ǡ������ֹ��ʽ
	{
		Runner4 r = new Runner4();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10000;i++){
			if(i % 1000 == 0){
				System.out.println("main"+i);
			}
		}
		r.shutdown();//Ҫ��Runner4����
	}
}
class Runner4 implements Runnable
{
	boolean flag = true;
	int i = 0;
	public void run(){
		while(flag){
			System.out.println(i++);
		}
	}
	public void shutdown(){
		flag = false;
	}
}


