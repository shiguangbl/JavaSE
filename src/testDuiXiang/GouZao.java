package testDuiXiang;
class Staff{
	private int age;
	private String name;
	Staff(){                         //���캯��:��new�����Ķ�����г�ʼ��
		System.out.println("���캯��");//���캯�������ڵĲ�ͬʱ���Զ������  �����������
	}	                             //���캯��һ������� Ĭ�ϵľͻ�ʧЧ �������չ������͵Ķ���Ķ���ᱨ��
	Staff(int age){
		this.age = age;                   //�淶:���еķ���������ĸСд�ڶ�����д �����캯�� ���� ����������ĸҪ��д
	}
	Staff(int age,String name){
		this.age = age;
		this.name = name;
	}
	void speak(){
		System.out.println("name="+name+"age="+age);
	}
}
public class GouZao {
	
	public static void main(String[] args) {
		Staff s = new Staff(50,"С��");//���������ݲ�ͬ ���õĹ��캯��Ҳ��ͬ ��ʼ��Ҳ�Ͳ�ͬ
		s.speak();
		Staff s2 = new Staff();
		s2.speak();
	//	s2.name = "ww";
		Staff s3 = new Staff(100);
		s3.speak();
	}

}