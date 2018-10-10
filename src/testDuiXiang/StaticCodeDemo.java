package testDuiXiang;
class StaticDemo{
	static int num = 0;
	static {                      //  静态代码块  随着类的加载而加载 无函数名 仅有static修饰符 一般用于不创建
		num += 5;                 //对象的类中  作用：给类进行初始化  区别：构造函数是给对象进行初始化
		System.out.println(num);  //静态可以被非静态调用  相反则不行
	}
	static void show(){
		System.out.println(num);
	}
}
public class StaticCodeDemo {
	static{
		System.out.println("随着类的加载而加载");
	}
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
	//	s.show();
	//	StaticDemo.show();
		

	}

}
