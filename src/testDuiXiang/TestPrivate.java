package testDuiXiang;

class Person
{
	private int age;//��װһ������(˽��)��ֻ�����ڲ��ܶ�˽�еĽ��и�ֵ  ���ֻ��ͨ�����ڲ��ķ���(����)�������ڲ���ֵ
	
	public void setAge(int age) {    //�˷������Ƕ��������е�һ������  
		this.age = age;                   //��˽�л�������Ҫͨ�������еĹ��߽��и�ֵ
	}
	public int getAge() {          //��������Ϊint ����Ϊ�� �ں������ʱ���㸳��������������ʹ��
		return age;
	}


	/*void woo(int a)
	{
		if(a>0&&a<130)//if���ֻ�ܶ��嵽��������
			age = a;
		else
			System.out.println("���������");
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
		p.setAge(50);                          //���Ը�����˽�л�����(����)���и�ֵ
		a = p.getAge();
	//	p.speak();
		System.out.println(a);
	}
}



