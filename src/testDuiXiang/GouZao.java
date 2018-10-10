package testDuiXiang;
class Staff{
	private int age;
	private String name;
	Staff(){                         //构造函数:给new出来的对象进行初始化
		System.out.println("构造函数");//构造函数括号内的不同时可以多个存在  这个叫做重载
	}	                             //构造函数一旦定义过 默认的就会失效 即不按照构造类型的定义的对象会报错
	Staff(int age){
		this.age = age;                   //规范:类中的方法名首字母小写第二个大写 而构造函数 类名 对象名首字母要大写
	}
	Staff(int age,String name){
		this.age = age;
		this.name = name;
	}
	void speak(){
		System.out.println("name="+name+"age="+age);
	}
}
public class GouZao {
	
	public static void main(String[] args) {
		Staff s = new Staff(50,"小王");//括号内内容不同 调用的构造函数也不同 初始化也就不同
		s.speak();
		Staff s2 = new Staff();
		s2.speak();
	//	s2.name = "ww";
		Staff s3 = new Staff(100);
		s3.speak();
	}

}