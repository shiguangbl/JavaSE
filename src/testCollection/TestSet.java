package testCollection;
import java.util.*;
class TestSet
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();//set��Ϊ��˳�򣬲��ظ�    δָ������
		s.add("hello");
		s.add("world");
		s.add(new Name("f1","s1"));
		s.add("hello");
		s.add(new Name("f1","s1"));
		System.out.println(s);//ɸ����ͬ��Ԫ��

		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("d");s2.add("a");s2.add("b");
		
		Set<String> sn = new HashSet<String>(s1);//HashSet�Ĺ��췽�� s1�����ݴ���sn��
		sn.retainAll(s2);//ȡ����
		System.out.println(sn);
		
		Set<String> su = new HashSet<String>(s1);
		su.addAll(s2);//��s2�е�Ԫ����ӵ�su��  ע��:��ͬ�Ļᱻɸ�� ��Ȼ�ڲ�������su��equals���������ж��Ƿ�Ϊ��ͬ�Ķ���
		System.out.println(su);
	}
}
