package testShuZhu;

public class ShuZhu {
	
	public static void main(String[] args) 
	{
		int a,b,c;
		a = getmax(45,65,58);
		System.out.println(a);
		
		int []arr={15,25,65,68};
		b = getmax2(arr);
		System.out.println(b);
		int []arr2={63,685,25,-36};
		c = getmax3(arr2);//���������  ��Ҫ�����Ӻ���getmax3������        ֮���ٰѷ���ֵ��ֵ��c
		System.out.println(c);
		/*int [] arr1 = new int []{89,34,270,17};
		int [] arr = {56,45,65,54};
		
		System.out.println(arr.length);
		
		 for(int i=arr.length-1;i<arr.length;i-=2)
		 {
			 System.out.println("arr["+i+"]"+arr[i]);
		 }
			 */

	}
	public static int getmax(int a,int b,int c)//�����ڵ�Ϊ   �����������л�ȡ�����ݸ�ֵ���Ѷ����a��b��c
	{
		int [] arr={a,b,c};
		int max= arr[0];
		for(int x=1;x<=arr.length-1;x++)
		{
			if(max<arr[x])
				max=arr[x];
		}
		return max;
	}
	public static int getmax2(int []arr)//���������ʽ�������������Ѷ���õ���������
	{
		int maxindex= 0;
		for(int x=1;x<=arr.length-1;x++)
		{
			if(arr[x]>arr[maxindex]) 
				arr[maxindex]=arr[x];
		}
		return arr[maxindex];
	}
	public static int getmax3(int []arr2)
	{
		int max = arr2[0];
		for(int x= 1;x<arr2.length;x++)
		{
			if(arr2[x]>max)
				max = arr2[x];
		}
		return max;
	}
	
}
