package testDuiXiang2;
final class T{
	final int a = 9;
	public final void tt() {
	}
	public void ttt(final int a){
//		a = 5;                ��final�ľֲ�����Ҳ�����޸�
	}
}
//class TT extends T{         ��final�����޷����̳�
//	public final void tt(){   ��final�ķ����޷�����д
//	}
//}
public class TestFinal {

	public static void main(String[] args) {
		T t = new T();
//		t.a = 9;              ��final�ı����޷����޸�

	}

}
