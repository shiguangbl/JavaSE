package testCollection;
import java.util.*;
class TestSet
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();//set类为无顺序，不重复    未指定泛型
		s.add("hello");
		s.add("world");
		s.add(new Name("f1","s1"));
		s.add("hello");
		s.add(new Name("f1","s1"));
		System.out.println(s);//筛除相同的元素

		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("d");s2.add("a");s2.add("b");
		
		Set<String> sn = new HashSet<String>(s1);//HashSet的构造方法 s1的内容传入sn内
		sn.retainAll(s2);//取交集
		System.out.println(sn);
		
		Set<String> su = new HashSet<String>(s1);
		su.addAll(s2);//将s2中的元素添加到su内  注意:相同的会被筛除 当然内部调用了su的equals方法进行判断是否为相同的对象
		System.out.println(su);
	}
}
