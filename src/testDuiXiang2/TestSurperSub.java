package testDuiXiang2;
class Sur{
	private String name;
	static{//��̬�����
		System.out.println("super�̳�");
	}
	Sur(){
		System.out.println("����");
	}
	Sur(String name){
		this.name = name;
		System.out.println("mame="+name);
	}
}
class Sub extends Sur{//�̳и���Ĺ��췽��   1.������ķ�����������б�����ø���Ĺ��췽��
//	private String name2;
	Sub(){//��������๹�췽����û����ʾ���ø��๹�췽��  ��ϵͳ�Զ�Ĭ�ϵ��ø����޲����Ĺ��췽��
		System.out.println("����");//��� ���๹�췽����û���޲������췽�� ��������
	}
	Sub(String name){
		super("mingming");//���ø���Ĺ��췽��ʱ�� super();1.�����ڵĸ�ʽ��ͬ���õ�Ҳ��ͬ
		System.out.println(name);//2. ����д�����๹�췽���ĵ�һ��
	}
}//���𷽷�����д����Ϊ�ڶԷ���(����)
public class TestSurperSub {
	public static void main(String[] args) {
		Sub children = new Sub("binglu");
	}
}
