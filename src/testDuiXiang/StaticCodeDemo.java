package testDuiXiang;
class StaticDemo{
	static int num = 0;
	static {                      //  ��̬�����  ������ļ��ض����� �޺����� ����static���η� һ�����ڲ�����
		num += 5;                 //���������  ���ã�������г�ʼ��  ���𣺹��캯���Ǹ�������г�ʼ��
		System.out.println(num);  //��̬���Ա��Ǿ�̬����  �෴����
	}
	static void show(){
		System.out.println(num);
	}
}
public class StaticCodeDemo {
	static{
		System.out.println("������ļ��ض�����");
	}
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
	//	s.show();
	//	StaticDemo.show();
		

	}

}
