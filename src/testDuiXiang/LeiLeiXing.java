package testDuiXiang;

class Car//�������ʱ����Ҫ��()   ���庯��ʱ��Ҫʹ��()Ŀ���ǶԺ����������ݵ�����
{
	int num;
	String name,color;
	void run(){
		 System.out.println("name="+name+" "+"color="+color);
	 }
}
public class LeiLeiXing {

	public static void main (String[] args){

		Car c1 = new Car();
//		Car c2 = new Car();
//		show(c2);
		show(c1);//�˴�c1Ϊ��show���������������   ��������޹�   ����ʲôʹ��ʲô
		}
	public static void show(Car c)//����һ�������͵Ĳ���   �˴���cֻ�����ڴ˻������ڵı��� 
	{
		c.color = "red";//���ַ����ͱ�����ֵ��ʱ�� Ҫ��˫����
		c.num = 4;
		c.run();//����֮����ö���ֻ��Ҫx.run����
		System.out.println(c.color);//����֮��ĶԶ�����и�ֵ �Լ����Ҫ��Բ�������(.)
	}
}
