package testDuiXiang;

class Person
{
	private int age;//封装一个年龄(私有)即只有类内部能对私有的进行赋值  外界只能通过类内部的方法(函数)进入类内部赋值
	
	public void setAge(int age) {    //此方法就是定义在类中的一个函数  
		this.age = age;                   //被私有化的类需要通过函数中的工具进行赋值
	}
	public int getAge() {          //函数类型为int 即不为空 在后面调用时方便赋给其它变量进行使用
		return age;
	}


	/*void woo(int a)
	{
		if(a>0&&a<130)//if语句只能定义到函数里面
			age = a;
		else
			System.out.println("错误的年龄");
	}*/
	void speak()
	{
		System.out.println("age="+age);
	}
}
public class TestPrivate{
	public static void main(String[]args){
		int a;
		Person p = new Person();
	//	p.age = 50; 
	//	p.woo(56);
		p.setAge(50);                          //可以给进行私有化的类(对象)进行赋值
		a = p.getAge();
	//	p.speak();
		System.out.println(a);
	}
}



