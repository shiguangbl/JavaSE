package changYongLei;
class  TestBaoZhuangLei
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(100);//将基本类型首字母大写  进行基本类型的封装
		Double d = new Double(12.345);//括号内的值也可以是字符串  它能调用parseDouble方法进行解析
		int i1 = i.intValue()+d.intValue();//intValue 是将其他基本类型包装类 转换为int数值
		System.out.println(i1);
		float f = i.floatValue()+d.floatValue();
		System.out.println(f);
		double pi = Double.parseDouble("3.1415926");//parse 是将字符串类型转换为基本类型数值
		double r = Double.valueOf("2.0").doubleValue();//valueOf将括号内转换为对象 doubleValue再将对象转换为数值
		double s = pi*r*r;
		System.out.println(s);
		try
		{
			int k = Integer.parseInt("1.25");//传入字符串以十进制解析  并返回十进制数值
		}
		catch (NumberFormatException e)//后面的e不能省 表示错误的对象
		{
			System.out.println("错误格式");
		}
		System.out.println(Integer.toBinaryString(123)+"B");//十进制输入2进制返回
		System.out.println(Integer.toHexString(123)+"H");//十进制输入16进制返回
		System.out.println(Integer.toOctalString(123)+"O");//十进制输入8进制返回
	}
}
