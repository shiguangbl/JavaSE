package testDuiXiang2;
final class T{
	final int a = 9;
	public final void tt() {
	}
	public void ttt(final int a){
//		a = 5;                被final的局部变量也不能修改
	}
}
//class TT extends T{         被final的类无法被继承
//	public final void tt(){   被final的方法无法被重写
//	}
//}
public class TestFinal {

	public static void main(String[] args) {
		T t = new T();
//		t.a = 9;              被final的变量无法被修改

	}

}
