package testDuiXiang;

class Hotel{
	private int amount,age;
	private String name;

	Hotel(){
		System.out.println("���ǽ���");
	}
	Hotel(int amount,String name){   // ����ǰ��� this.����Ϊ  ��������XXX  
		this.amount = amount;        //�ĸ��������������� ���е�this�ʹ����ĸ�����
		this.name = name;
	}
	public void setAge(int age){   //��intΪ����ֵ����  ���������ʽ�����η� ����ֵ���� ������(){...}
		this.age = age;
	}
	public int getAge(){           //����ֵ��Ϊ�յĺ���Ҫ��	return ���صı�����; 
		return age;
	}
	public void speak(){
		System.out.println(amount+"   "+name);
	}
	public boolean compare(Hotel h2){   //����������h2����  ����ΪHotel ��������Ϊboolean����
//		if(this.amount>h2.amount)         �ж������С
//			return true;
//		else
//			return false;
		return this.amount==h2.amount;  //�ж��Ƿ�ͬ����
	}
}
public class Testcompare {

	public static void main(String[] args) {
		Hotel h = new Hotel(6,"mingming");
		Hotel h2 = new Hotel(5,"lulu");
		h.setAge(56); 
		System.out.println(h.compare(h2)); //����compare������������Ϊ hotel���Ͷ���h2
	//	System.out.println("Age="h.getAge());
		h.speak();

	}
}
