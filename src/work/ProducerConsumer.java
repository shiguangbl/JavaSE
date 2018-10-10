package work;

class ProducerConsumer 
{
	public static void main(String[] args) 
	{
		Basket b = new Basket();
		Producer p = new Producer(b);//两个线程同时访问了同一个对象 即线程同步
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
	public String toString(){//打印出一个对象的比较好的方法 重写toString方法
		return "WoTou:"+id;
	}
}
class Basket
{
	int index = 0;
	WoTou [] arrwt = new WoTou[6];//创建WoTou对象的数组

	public synchronized void push(WoTou wt){//因为有两个线程同时访问防止出现数据前后不一致的情况 采用加锁
		while(index ==arrwt.length){//【注意】:锁定对象后才能使用wait方法，并且在wait的过程中会放开那把锁
			try{
				this.wait();//使当前正在访问这个对象的线程wait 其与notify相对应
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();       //叫醒一个正在当前对象wait的线程  notifyAll() 方法是叫醒所有访问当前对象wait住的线程
		arrwt [index] = wt;
		arrwt [index] = wt;
		index ++;

	}
	public synchronized WoTou pop(){
		while(index ==0){    //不用if进行判断:如果在wait的过程被打断 会跳出if 但是while会继续进行判断 
			try{
				this.wait(); //当馒头为零的时候进行wait
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		index --;              //此方式可以做到让后进入篮子的先取出来
		return arrwt[index];
	}
}
class Producer implements Runnable
{
	Basket b = null;
	Producer(Basket b){       //多个对象的相互引用  将basket对象调入此对象进行操作
		this.b = b;
	}
	public void run(){
		for(int i=0;i<20;i++){
			WoTou wt = new WoTou(i);
			b.push(wt);        //方法相互调用的时候注意传入值以及返回值
			System.out.println("生产了"+wt);
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
			WoTou wt = b.pop();            //不需要在new出来WoTou对象 直接调用取的方法就行
			System.out.println("消费了"+wt);//取的方法的返回值就是消费的WoTou本身
			try{
				Thread.sleep((int)(Math.random()*1000));//此方法的返回值是double类型 所以要强制转换
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
