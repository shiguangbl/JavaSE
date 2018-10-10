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
	//  一个加法计算器
	public static int add(int a,int b)
	{
		return a+b;
	}
	//  返回值为空的子函数
	public static void myprint(){
		System.out.println("lenovo tianti315");
	//	return;
	}
	/*返回值类型和参数类型没有直接关系        加法计算引入sum
	public static int add2(int e,int d){
		int sum = e+d;
		return sum;
	}
	*/
	//  在控制台打印出一个矩形
	public static void draw(int row,int col)// void 函数名 (输入数据类型 输入的数据，...){...}
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
	//  比较两个数是否相等
	public static boolean equal(int a,int b)
	{
		//return(a==b);
		return a==b?true : false;
	}
	//  输出两个数中的较大的一个
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