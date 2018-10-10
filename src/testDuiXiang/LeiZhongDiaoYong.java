package testDuiXiang;

class School{
	private int num;
	private String name;
	static int year;              //静态随着类的建立而存在 非静态随着对象的建立而存在，所以不用创建对象
	                              //就能调用静态成员和函数，而静态要通过对象而调用
	School(int num,String name){
		this.num = num;
		this.name = name;
	}
	static void see2(){
		System.out.println("窃窃私语");
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
	public void see3(){         //类中函数相互调用，调用一定要放到第一位
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
