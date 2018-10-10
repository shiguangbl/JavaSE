package changYongLei;
class TestEnum 
{
	public enum MyColor{black,red,yellow}//枚举的定义

	public static void main(String[] args) 
	{
		MyColor c = MyColor.black;//枚举的调用
		switch(c){
			case red:
				System.out.println("red");
				break;
			case black:
				System.out.println("black");
				break;
			case yellow:
				System.out.println("yellow");
				break;
			default:
				System.out.println("default");
		}
		System.out.println(c);//black      即打印出其代表的内容
	}
}
