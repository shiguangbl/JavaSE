package testJiBenYuFa;
public class HanShu
{
	public static void main(String []agres){
		int c,d;
		boolean e;
		c = add(3,5);
		//f = add2(6,5);
		System.out.println(c);
		myprint();
		draw(3,4);
		e = equal(3,3);
		System.out.println(e);
		d = getmax(3,6);
		System.out.println(d);
	}
	//  һ���ӷ�������
	public static int add(int a,int b)
	{
		return a+b;
	}
	//  ����ֵΪ�յ��Ӻ���
	public static void myprint(){
		System.out.println("lenovo tianti315");
	//	return;
	}
	/*����ֵ���ͺͲ�������û��ֱ�ӹ�ϵ        �ӷ���������sum
	public static int add2(int e,int d){
		int sum = e+d;
		return sum;
	}
	*/
	//  �ڿ���̨��ӡ��һ������
	public static void draw(int row,int col)// void ������ (������������ ��������ݣ�...){...}
	{
		for(int x=1;x<=row;x++)
		{
			for(int y=1;y<=col;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//  �Ƚ��������Ƿ����
	public static boolean equal(int a,int b)
	{
		//return(a==b);
		return a==b?true : false;
	}
	//  ����������еĽϴ��һ��
	public static int getmax(int a,int b)
	{
		/*if(a>=b)
			return a;
		else
			return b; 
		*/
		return(a>=b?a:b);                 
 	}
	


}	