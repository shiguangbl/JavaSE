package testDuiXiang2;
interface Valuable{
	public double getMoney();//尽量避免在不同的接口中定义相同的方法  如果需要要把两个方法的格式保持一致
}
interface Protectable{
	public void beProtected();
}
interface A extends Protectable{//接口也可以继承  并且在A内部不用重写被继承接口的方法
	public void m();
	public double getMoney(); 
}
class Hen implements A {
	public void beProtected(){}
	public void m(){}
	public double getMoney(){
		return 10;
	}
}
abstract class Animal2{
	private String name;
	abstract void enjoy();
}
class GoldenMonkey extends Animal2 implements Valuable, Protectable{//采用接口，性质上达到了多继承
	public double getMoney(){
		return 1000;
	}
	public void beProtected(){
		System.out.println("living in room");
	}
	public void enjoy(){//方法原样copy不能再用abstract 改用public
		System.out.println("happy");
		
	}
}
public class TestJK2 {

	public static void main(String[] args) {
		Valuable a = new GoldenMonkey();
		a.getMoney();
		Protectable p = (Protectable)a;
		p.beProtected();

	}

}
