package testDuiXiang2;
class Sur{
	private String name;
	static{//静态代码块
		System.out.println("super继承");
	}
	Sur(){
		System.out.println("父类");
	}
	Sur(String name){
		this.name = name;
		System.out.println("mame="+name);
	}
}
class Sub extends Sur{//继承父类的构造方法   1.在子类的方法构造过程中必须调用父类的构造方法
//	private String name2;
	Sub(){//如果在子类构造方法中没有显示调用父类构造方法  即系统自动默认调用父类无参数的构造方法
		System.out.println("子类");//如果 父类构造方法中没有无参数构造方法 则编译出错
	}
	Sub(String name){
		super("mingming");//调用父类的构造方法时用 super();1.括号内的格式不同调用的也不同
		System.out.println(name);//2. 必须写在子类构造方法的第一行
	}
}//区别方法的重写：其为于对方法(函数)
public class TestSurperSub {
	public static void main(String[] args) {
		Sub children = new Sub("binglu");
	}
}
