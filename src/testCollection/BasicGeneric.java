package testCollection;
import java.util.*;

public class BasicGeneric {//泛型
	public static void main(String[] args) {
		List<String> c = new ArrayList<String>();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		for(int i=0; i<c.size(); i++) {
			String s = c.get(i);
			System.out.println(s);
		}
		
		Collection<String> c2 = new HashSet<String>();
		c2.add("aaa"); c2.add("bbb"); c2.add("ccc");
		for(Iterator<String> it = c2.iterator(); it.hasNext(); ) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

class MyName implements Comparable<MyName> {//API文档内类名标题后跟<E>的就可以跟泛型，即今后仅仅对E类型的进行操作
	int age;									//其他类型的压根传不过来
	
	public int compareTo(MyName mn) {
		if(this.age > mn.age) return 1;
		else if(this.age < mn.age) return -1;
		else return 0;
	}
}