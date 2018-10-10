package changYongLei;
class Teststring {
	public static void main(String[] args) //String类的方法
	{
		String s1 = "sun java";
		String s2 = "Sun Java";
		System.out.println(s1.charAt(1));//u					返回第1（下角标）个字符
		System.out.println(s2.length());//8			                            返回字符串长度
		System.out.println(s1.indexOf("java"));//4				返回出现java的第一个位置
		System.out.println(s1.indexOf("Java"));//-1                                                 如果没有返回-1
		System.out.println(s1.equals(s2));//false				判断两个字符是否相同（java已经将equals方法重写）
//		System.out.println(s1 == s2);//false 此为判断引用
		System.out.println(s1.equalsIgnoreCase(s2));//true		忽略大小写前提判断字符是否相同

		String s3 = "我是计算16-4班的 我在学java";
		String s33 = s3.replace('我','你'); 
		System.out.println(s33);//我是计算16-4班的 你在学java			替换特定字符
		
		String s4 = new String("Welcome To Java World!");
		System.out.println(s4.startsWith("Welcome"));//true				判断开始字符
		System.out.println(s4.endsWith("Word"));//false					判断结尾字符
		System.out.println(s4.toLowerCase());//welcome to java world!	大写换小写
		System.out.println(s4.toUpperCase());//WELCOME TO JAVA WORLD!	小写换大写
		System.out.println(s4.substring(11));//Java World!				截取从数组角标11的开始到结尾
		String s5 = "   sun java   ";
		System.out.println(s5.trim());//sun java						去开头结尾空格
		
		Date d = new Date(2016,12,20);
		int i = 1234567;
//		String s6 = String.valueOf(d);//此方法可以传入int double... 以及类的引用
		String s7 = String.valueOf(i);//将其转换成字符
		System.out.println(String.valueOf(d));//"Year:Month:Day -- 2016-12-20
		System.out.println(s7);//1234567
		System.out.println(s7.length());//7
		String s8 = "binglu,man,19";
		String[]spilt = s8.split(",");//将字符中的，变成分隔符进行分割  分割成子串 保存字符数组里
		for(int i1=0;i1<spilt.length;i1++){
			System.out.println(spilt[i1]);
		}
	}	
}
class Date{
	int year,month,day;
	Date(int y,int m,int d){
		year = y;
		month = m;
		day = d;
	}
	  public String toString(){
			return "Year:Month:Day -- " + year + "-" + month + "-" + day;
		  }
}
