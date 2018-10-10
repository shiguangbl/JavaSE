package testDuiXiang2;
abstract class Animal{//抽象类   因为其包含了抽象方法 
	public String name;
	Animal(String name){
		this.name = name;
	}
	public abstract void enjoy();//抽象方法：其没有大括号，此方法就是被用来重写的。
}                                //因为父类的方法不需要去实现，并且一定要存在。
abstract class Bird extends Animal{
	Bird(String n){
		super(n);
	}
	public abstract void enjoy();//当然，其子类也可以不去实现此方法，也将其定成抽象方法，
//	{                            //但是，其类也要修改为抽象类，并且其无法作为一个完整的类
//		System.out.println("鸟叫。。。");
//	}
}
class Dog extends Animal{
	public String furColor;
	Dog(String n,String furColor){
		super(n);
		this.furColor = furColor;
	}
	public void enjoy(){
		System.out.println("汪。。。");
	}
}
class Cat extends Animal{
	public String eyesColor;
	Cat(String n,String eyesColor){
		super(n);
		this.eyesColor = eyesColor;
	}
	public void enjoy(){
		System.out.println("喵。。。");
	}
}
class Lady {
	public String name;
	public Animal pet;
	Lady(String name,Animal pet){
		this.name = name;
		this.pet = pet;
	}
	public void petEnjoy(){//动态绑定 ：调用方法时 按照实际的对象进行调用方法
		pet.enjoy();//而成员变量则需要用 instanceof进行判定哪种对象
	}
}
public class TestDT {//多态 1.要有继承 2.要有重写 3.父类引用指向子类对象
	public static void main(String[] args) {
	//	Animal a = new Animal("animal");抽象类是残缺的类  无法new出来对象 
//		Bird b = new Bird("bird");
		Dog d = new Dog("dog","yellow");
		Cat c = new Cat("cat","blue");
//		Lady l1 = new Lady("l1",b);
		Lady l2 = new Lady("l2",d);
		Lady l3 = new Lady("l3",c);
//		l1.petEnjoy();
		l2.petEnjoy();
		l3.petEnjoy();
	}
}
