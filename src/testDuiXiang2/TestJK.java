package testDuiXiang2;
interface Singer{//�ӿڣ�һ������ĳ����� �����������Ķ����Լ������Ķ��� ����ȥʵ�ַ���
	public static final int id = 1;//��interfaceȡ��class  ����ı���Ҫ��ֵ
	public void sing();//�ӿ�������Ĭ��Ϊ�ҽ�Ϊpublic static final
	public void sleep();//�ӿ��н��ܶ�����󷽷� ʹ�ò�������ʹ��public ����ʡ��abstract
}
interface Painter{
	public void paint();
	public void eat();
}
class Student implements Singer{//�ӿڵ�ʵ�֣�implementsȡ��extends
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
		Singer s2 = new Teacher("wang");//��	Singer�ĽǶ���������ʵ����Teacher�Ķ���
		s2.sing();
		s2.sleep();
		Painter p = (Painter)s2;//��s2�����ʵ��ǿ��ת����Painter�ĽǶ�
//		s2.paint();
		p.paint();
		p.eat();
	}
	void f(Singer s){//�ӿ���̳�����  �ӿ���ʵ������ڶ�̬��
		s.sing();//�� ��singer()����Ϊ��д�ķ���
	}

}
