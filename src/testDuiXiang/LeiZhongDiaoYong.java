package testDuiXiang;

class School{
	private int num;
	private String name;
	static int year;              //��̬������Ľ��������� �Ǿ�̬���Ŷ���Ľ��������ڣ����Բ��ô�������
	                              //���ܵ��þ�̬��Ա�ͺ���������̬Ҫͨ�����������
	School(int num,String name){
		this.num = num;
		this.name = name;
	}
	static void see2(){
		System.out.println("����˽��");
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
	public void see(){
		System.out.println(num+" "+name);
	}
	public void see3(){         //���к����໥���ã�����һ��Ҫ�ŵ���һλ
		this.see();
	}
}
public class LeiZhongDiaoYong {

	public static void main(String[] args) {
	//	Second.see2();
		School s = new School(5000,"henanligong");
		s.setNum(500);
	//	s.see();
		s.see3();
		System.out.println(s.getNum());
	}
}
