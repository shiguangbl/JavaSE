package testDuiXiang2;
interface Valuable{
	public double getMoney();//���������ڲ�ͬ�Ľӿ��ж�����ͬ�ķ���  �����ҪҪ�����������ĸ�ʽ����һ��
}
interface Protectable{
	public void beProtected();
}
interface A extends Protectable{//�ӿ�Ҳ���Լ̳�  ������A�ڲ�������д���̳нӿڵķ���
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
class GoldenMonkey extends Animal2 implements Valuable, Protectable{//���ýӿڣ������ϴﵽ�˶�̳�
	public double getMoney(){
		return 1000;
	}
	public void beProtected(){
		System.out.println("living in room");
	}
	public void enjoy(){//����ԭ��copy��������abstract ����public
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
