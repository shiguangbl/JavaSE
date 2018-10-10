package testDuiXiang2;
abstract class Animal{//������   ��Ϊ������˳��󷽷� 
	public String name;
	Animal(String name){
		this.name = name;
	}
	public abstract void enjoy();//���󷽷�����û�д����ţ��˷������Ǳ�������д�ġ�
}                                //��Ϊ����ķ�������Ҫȥʵ�֣�����һ��Ҫ���ڡ�
abstract class Bird extends Animal{
	Bird(String n){
		super(n);
	}
	public abstract void enjoy();//��Ȼ��������Ҳ���Բ�ȥʵ�ִ˷�����Ҳ���䶨�ɳ��󷽷���
//	{                            //���ǣ�����ҲҪ�޸�Ϊ�����࣬�������޷���Ϊһ����������
//		System.out.println("��С�����");
//	}
}
class Dog extends Animal{
	public String furColor;
	Dog(String n,String furColor){
		super(n);
		this.furColor = furColor;
	}
	public void enjoy(){
		System.out.println("��������");
	}
}
class Cat extends Animal{
	public String eyesColor;
	Cat(String n,String eyesColor){
		super(n);
		this.eyesColor = eyesColor;
	}
	public void enjoy(){
		System.out.println("��������");
	}
}
class Lady {
	public String name;
	public Animal pet;
	Lady(String name,Animal pet){
		this.name = name;
		this.pet = pet;
	}
	public void petEnjoy(){//��̬�� �����÷���ʱ ����ʵ�ʵĶ�����е��÷���
		pet.enjoy();//����Ա��������Ҫ�� instanceof�����ж����ֶ���
	}
}
public class TestDT {//��̬ 1.Ҫ�м̳� 2.Ҫ����д 3.��������ָ���������
	public static void main(String[] args) {
	//	Animal a = new Animal("animal");�������ǲ�ȱ����  �޷�new�������� 
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
