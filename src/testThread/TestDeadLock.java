package testThread;

class TestDeadLock implements Runnable//死锁现象的测试 作为了解 系统级的程序员才编写这些
{
	public int flag = 1;//一般为防止死锁现象，将锁的范围加大，例如:欲锁一间屋子,可锁整个宫殿
	static Object o1 = new Object(),o2 = new Object();//锁定整个大对象，不要仅锁定大对象里面的小对象
	public void run(){
		System.out.println(flag);
		if(flag == 1){
			synchronized(o1){//锁定o1
				try{
					Thread.sleep(50);
				}catch(InterruptedException e){}//同样,一般不允许catch到异常却不做处理
				synchronized(o2){//锁定o2
					System.out.println(1);
				}
			}
		}
		if(flag == 0){
			synchronized(o2){//锁定o2
				try{
					Thread.sleep(50);
				}catch(InterruptedException e){}
				synchronized(o1){//锁定o1
					System.out.println(0);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		TestDeadLock td1 = new TestDeadLock();
		TestDeadLock td2 = new TestDeadLock();
		td1.flag = 0;
		td2.flag = 1;
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		t1.start();
		t2.start();
	}
}
