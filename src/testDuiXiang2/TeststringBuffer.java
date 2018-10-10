package testDuiXiang2;
class TeststringBuffer{//StringBuffer  为缓存字符  可以随意添加删除
	public static void main(String[] args) 
	{
		String s = "hpu";
		char c[] = {'a','b','c'};
		StringBuffer s1 = new StringBuffer(s);
		s1.append('w').append('/').append("bing").append('/').append("lu");
		System.out.println(s1);//append返回值是自身  所以可以连续append
		StringBuffer s2 = new StringBuffer("数字");
		for(int i=0;i<9;i++)
			s2.append(i);
		System.out.println(s2);
		s2.delete(8,s2.length()).insert(0,c);//删除从索引8到最后  从索引0开始插入字符数组c
		System.out.println(s2);
		System.out.println(s2.reverse());//将s2倒叙
	}
}