package testDuiXiang;

class Car//定义类的时候不需要用()   定义函数时需要使用()目的是对函数进行数据的输入
{
	int num;
	String name,color;
	void run(){
		 System.out.println("name="+name+" "+"color="+color);
	 }
}
public class LeiLeiXing {

	public static void main (String[] args){

		Car c1 = new Car();
//		Car c2 = new Car();
//		show(c2);
		show(c1);//此处c1为向show函数里输入的数据   和下面的无关   定义什么使用什么
		}
	public static void show(Car c)//定义一个类类型的参数   此处的c只是用于此花括号内的变量 
	{
		c.color = "red";//给字符类型变量赋值的时候 要加双引号
		c.num = 4;
		c.run();//在类之外调用对象只需要x.run即可
		System.out.println(c.color);//在类之外的对对象进行赋值 以及输出要用圆点运算符(.)
	}
}
