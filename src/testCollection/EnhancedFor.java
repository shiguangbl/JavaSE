package testCollection;
import java.util.*;
class EnhancedFor 
{
	public static void main(String[] args) 
	{
		int []arr = new int [] {1,2,5,6,7};
		for(int i:arr){		//��ǿ��forѭ��
			System.out.println(i);
		}
		Collection<String> c = new ArrayList<String>();
		c.add("c1");
		c.add("c2");
		c.add("c3");
		for(Object o : c){//��c�е�Ԫ�ذ�˳���ó����ŵ�o����Ȼ���ӡo �ڼ������o���ַ�����toString����
			System.out.println(o);//�ַ����Ѿ���д��toString����
		}
	}
}