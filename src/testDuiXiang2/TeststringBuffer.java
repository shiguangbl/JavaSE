package testDuiXiang2;
class TeststringBuffer{//StringBuffer  Ϊ�����ַ�  �����������ɾ��
	public static void main(String[] args) 
	{
		String s = "hpu";
		char c[] = {'a','b','c'};
		StringBuffer s1 = new StringBuffer(s);
		s1.append('w').append('/').append("bing").append('/').append("lu");
		System.out.println(s1);//append����ֵ������  ���Կ�������append
		StringBuffer s2 = new StringBuffer("����");
		for(int i=0;i<9;i++)
			s2.append(i);
		System.out.println(s2);
		s2.delete(8,s2.length()).insert(0,c);//ɾ��������8�����  ������0��ʼ�����ַ�����c
		System.out.println(s2);
		System.out.println(s2.reverse());//��s2����
	}
}