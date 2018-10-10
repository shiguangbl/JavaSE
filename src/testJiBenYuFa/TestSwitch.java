package testJiBenYuFa;

public class TestSwitch {
	public static void main(String[] args) {
		
	getmouth(86);//对于返回值为空的函数 直接打出该子函数的名字进行调用  括号内为将要输入到子函数的数据(也可以为空)

	}
	public static void getmouth(int mouth)//封装一个判断月份的函数
	{

		switch (mouth)//将括号内(进行运算后)送入下面给case进行判断
		{	
			
			case 3:   //要小心case穿透: 一旦其中一个case判断通过将不进行下面case的判断直接执行case下的语句
			case 4:
			case 5:
				System.out.println(mouth+"月是春季");
				break;/*运行到此语句时将跳出该switch     另一种跳出方式为按照顺序执行到 } 结束
				                   而如果所有的case都不满足时就去寻找并执行default语句 并且在没有break语句时继续按顺序在
				                   接下来的语句中不判断就执行case下语句  直至有break或者}时跳出该switch           
				       */
			case 6:
			case 7:
			case 8:
				System.out.println(mouth+"月是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(mouth+"月是秋季");
				break;
			case 12:
			case 13:
			case 14:
				System.out.println(mouth+"月是冬季");
			default	://此语句要将前面所有case语句判断后皆没有对应时才进行此语句  并且不考虑其位置
				System.out.println("没有对应的季节");

		}
	}
}
