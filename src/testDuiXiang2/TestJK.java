package testDuiXiang2;
interface Singer{//接口：一个特殊的抽象类 仅包含常量的定义以及方法的定义 而不去实现方法
	public static final int id = 1;//用interface取代class  定义的变量要赋值
	public void sing();//接口中声明默认为且仅为public static final
	public void sleep();//接口中仅能定义抽象方法 使用并仅仅能使用public 并且省略abstract
}
interface Painter{
	public void paint();
	public void eat();
}
class Student implements Singer{//接口的实现：implements取代extends
	private String name;
	Student(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void sing(){
		System.out.println("student is singing");
	}
	public void sleep(){
		System.out.println("student is sleeping");
	}
	public void study(){
		System.out.println("student is studying");
	}
}
class Teacher implements Singer,Painter{
	private String name;
	Teacher(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void sing(){
		System.out.println("student is singing");
	}
	public void sleep(){
		System.out.println("student is sleeping");
	}
	public void paint(){
		System.out.println("teacher is painting");
	}
	public void eat(){
		System.out.println("teacher is eatting");
	}
}

public class TestJK {
	public static void main(String[] args) {
		Singer s1 = new Student("le");
		s1.sing();
		s1.sleep();
		Singer s2 = new Teacher("wang");//在	Singer的角度上来看待实质是Teacher的对象
		s2.sing();
		s2.sleep();
		Painter p = (Painter)s2;//将s2对象的实质强制转换到Painter的角度
//		s2.paint();
		p.paint();
		p.eat();
	}
	void f(Singer s){//接口与继承相似  接口与实现类存在多态性
		s.sing();//即 此singer()方法为重写的方法
	}

}
