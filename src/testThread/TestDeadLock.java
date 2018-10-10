package testThread;

class TestDeadLock implements Runnable//��������Ĳ��� ��Ϊ�˽� ϵͳ���ĳ���Ա�ű�д��Щ
{
	public int flag = 1;//һ��Ϊ��ֹ�������󣬽����ķ�Χ�Ӵ�����:����һ������,������������
	static Object o1 = new Object(),o2 = new Object();//������������󣬲�Ҫ����������������С����
	public void run(){
		System.out.println(flag);
		if(flag == 1){
			synchronized(o1){//����o1
				try{
					Thread.sleep(50);
				}catch(InterruptedException e){}//ͬ��,һ�㲻����catch���쳣ȴ��������
				synchronized(o2){//����o2
					System.out.println(1);
				}
			}
		}
		if(flag == 0){
			synchronized(o2){//����o2
				try{
					Thread.sleep(50);
				}catch(InterruptedException e){}
				synchronized(o1){//����o1
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
