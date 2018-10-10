package testCollection;
import java.util.*;
class TestList 
{
	public static void main(String[] args) 
	{
		List<String> l1 = new LinkedList<String>();
		for(int i=0;i<5;i++){
			l1.add("a"+i);
		}
		System.out.println(l1);
		l1.add(3,"a100");//将位置3加入a100  原来的元素不会覆盖而是向后移一位
		System.out.println(l1);

		System.out.println(l1.set(3,"a200"));//返回值为所替换掉的元素
		System.out.println(l1);
		System.out.println(l1.get(2));//得到链序为2的元素
		System.out.println(l1.indexOf("a3"));//找到a3元素的位置
		l1.remove(3);//移除位置1的元素
		System.out.println(l1);
		
		Collections.shuffle(l1);//随机排序
		System.out.println(l1);//[a1, a2, a3, a0, a4]
		Collections.reverse(l1);//将顺序逆序
		System.out.println(l1);//[a4, a0, a3, a2, a1]
		Collections.sort(l1);//由小到大排序
		System.out.println(l1);//[a0, a1, a2, a3, a4]
		System.out.println(Collections.binarySearch(l1,"a3"));//3  用二分法查找(注意:顺序要排好)
	}
}
