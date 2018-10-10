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
		l1.add(3,"a100");//��λ��3����a100  ԭ����Ԫ�ز��Ḳ�Ƕ��������һλ
		System.out.println(l1);

		System.out.println(l1.set(3,"a200"));//����ֵΪ���滻����Ԫ��
		System.out.println(l1);
		System.out.println(l1.get(2));//�õ�����Ϊ2��Ԫ��
		System.out.println(l1.indexOf("a3"));//�ҵ�a3Ԫ�ص�λ��
		l1.remove(3);//�Ƴ�λ��1��Ԫ��
		System.out.println(l1);
		
		Collections.shuffle(l1);//�������
		System.out.println(l1);//[a1, a2, a3, a0, a4]
		Collections.reverse(l1);//��˳������
		System.out.println(l1);//[a4, a0, a3, a2, a1]
		Collections.sort(l1);//��С��������
		System.out.println(l1);//[a0, a1, a2, a3, a4]
		System.out.println(Collections.binarySearch(l1,"a3"));//3  �ö��ַ�����(ע��:˳��Ҫ�ź�)
	}
}
