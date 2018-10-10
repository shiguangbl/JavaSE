package testCollection;
import java.util.*;
class EnhancedFor 
{
	public static void main(String[] args) 
	{
		int []arr = new int [] {1,2,5,6,7};
		for(int i:arr){		//增强的for循环
			System.out.println(i);
		}
		Collection<String> c = new ArrayList<String>();
		c.add("c1");
		c.add("c2");
		c.add("c3");
		for(Object o : c){//把c中的元素按顺序拿出来放到o里面然后打印o 期间调用了o的字符串的toString方法
			System.out.println(o);//字符串已经重写了toString方法
		}
	}
}