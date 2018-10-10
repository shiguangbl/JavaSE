package work;

class ProducerConsumer 
{
	public static void main(String[] args) 
	{
		Basket b = new Basket();
		Producer p = new Producer(b);//�����߳�ͬʱ������ͬһ������ ���߳�ͬ��
		Consumer c = new Consumer(b);
		new Thread(p).start();
		new Thread(c).start();
	}
}
class WoTou
{
	int id;
	WoTou(int id){
		this.id = id;
	}
	public String toString(){//��ӡ��һ������ıȽϺõķ��� ��дtoString����
		return "WoTou:"+id;
	}
}
class Basket
{
	int index = 0;
	WoTou [] arrwt = new WoTou[6];//����WoTou���������

	public synchronized void push(WoTou wt){//��Ϊ�������߳�ͬʱ���ʷ�ֹ��������ǰ��һ�µ���� ���ü���
		while(index ==arrwt.length){//��ע�⡿:������������ʹ��wait������������wait�Ĺ����л�ſ��ǰ���
			try{
				this.wait();//ʹ��ǰ���ڷ������������߳�wait ����notify���Ӧ
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();       //����һ�����ڵ�ǰ����wait���߳�  notifyAll() �����ǽ������з��ʵ�ǰ����waitס���߳�
		arrwt [index] = wt;
		arrwt [index] = wt;
		index ++;

	}
	public synchronized WoTou pop(){
		while(index ==0){    //����if�����ж�:�����wait�Ĺ��̱���� ������if ����while����������ж� 
			try{
				this.wait(); //����ͷΪ���ʱ�����wait
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		index --;              //�˷�ʽ���������ú�������ӵ���ȡ����
		return arrwt[index];
	}
}
class Producer implements Runnable
{
	Basket b = null;
	Producer(Basket b){       //���������໥����  ��basket�������˶�����в���
		this.b = b;
	}
	public void run(){
		for(int i=0;i<20;i++){
			WoTou wt = new WoTou(i);
			b.push(wt);        //�����໥���õ�ʱ��ע�⴫��ֵ�Լ�����ֵ
			System.out.println("������"+wt);
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable
{
	Basket b = null;
	Consumer(Basket b){
		this.b = b;
	}
	public void run(){
		for(int i=0;i<20;i++){
			WoTou wt = b.pop();            //����Ҫ��new����WoTou���� ֱ�ӵ���ȡ�ķ�������
			System.out.println("������"+wt);//ȡ�ķ����ķ���ֵ�������ѵ�WoTou����
			try{
				Thread.sleep((int)(Math.random()*1000));//�˷����ķ���ֵ��double���� ����Ҫǿ��ת��
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
