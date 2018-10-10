package testDuiXiang2;
class Anima{
	public String name;
	Anima (String name){
		this.name = name;		
	}
}
class Cat2 extends Anima{
	public String eyeColor;
	Cat2(String n,String c){
		super(n);
		eyeColor = c;
	}
}
class Dog2 extends Anima{
	public String furColor;
	Dog2(String n,String c){
		super(n);
		furColor = c;
	}
}
public class TestDXZX {//����ת��
	public static void main(String[] args) {
		Anima a = new Anima("Animal");
		Dog2 d = new Dog2("dogname","black");
		Cat2 c = new Cat2("catname","blue");
		TestDXZX test = new TestDXZX();
		test.f(a);test.f(c);test.f(d);
		
		
		
//		System.out.println(a instanceof Anima);//instanceof����Ϊ...��...
//		System.out.println(d instanceof Anima);
//		System.out.println(c instanceof Anima);
//		System.out.println(a instanceof Cat2);//
//		
//		a = new Dog2("bigyellow","yellow");//��ΪDog2 ��Anima a ������//��a��ʱʵ��ΪDog2
//		System.out.println(a.name);//�����л��dog2����Anima���� ���޷�����furColor
//		//System.out.println(a.furColor);//error
//		System.out.println(a instanceof Anima);
//		System.out.println(a instanceof Dog2);//instanceof̽��a��ʵ�� ����ʵ��ΪDog
//		Dog2 d1 = (Dog2)a;//�ٰ�aǿ��ת��ΪDog2
//		System.out.println(d1.furColor);
	}
	private void f(Anima a){
		System.out.println("name:"+a.name);
		if(a instanceof Cat2){
			Cat2 cat2 = (Cat2)a;
			System.out.println("eyeColor:"+cat2.eyeColor);
		}
		else if(a instanceof Dog2){
			Dog2 dog2 = (Dog2)a;
			System.out.println("furColor:"+dog2.furColor);
		}
	}
}