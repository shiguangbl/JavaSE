package testJiBenYuFa;

public class HanShu2 {

	public static void main(String[] args) {
		int a;
		a = getmax(5,6);
		System.out.println(a);
		print99();
		char c = getlevel(89.5);
		System.out.println(c);
	}
	
	public static int getmax (int a,int b)//输出两个数中的较大的那个
	{
		return a>=b?a:b ;                
 	}
	
	public static void print99()//打印一个9*9乘法表
	{
		for(int x=1;x<=9;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
	
	public static char getlevel(double num)//打印学生成绩
	{
		if(num>=90 && num<=100)
			return 'A';
		else if(num>=80 && num<90)
			return 'B';
		else if(num>=70 && num<80)
			return 'C';
		else if(num>=60 && num<70)
			return 'D';
		else 
			return 'E';
	}
}
