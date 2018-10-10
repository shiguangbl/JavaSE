package testDuiXiang2;
class dog3{
	public String toString(){//对 Object 的toString方法的重写
		return "I'm a big dog";//默认情况返回一个名字+@+哈希码值
	}
}
public class TestToString {

	public static void main(String[] args) {
		dog3 d = new dog3();
		System.out.println("d:"+d);//直接打印 类

	}

}
