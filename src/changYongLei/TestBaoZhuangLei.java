package changYongLei;
class  TestBaoZhuangLei
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(100);//��������������ĸ��д  ���л������͵ķ�װ
		Double d = new Double(12.345);//�����ڵ�ֵҲ�������ַ���  ���ܵ���parseDouble�������н���
		int i1 = i.intValue()+d.intValue();//intValue �ǽ������������Ͱ�װ�� ת��Ϊint��ֵ
		System.out.println(i1);
		float f = i.floatValue()+d.floatValue();
		System.out.println(f);
		double pi = Double.parseDouble("3.1415926");//parse �ǽ��ַ�������ת��Ϊ����������ֵ
		double r = Double.valueOf("2.0").doubleValue();//valueOf��������ת��Ϊ���� doubleValue�ٽ�����ת��Ϊ��ֵ
		double s = pi*r*r;
		System.out.println(s);
		try
		{
			int k = Integer.parseInt("1.25");//�����ַ�����ʮ���ƽ���  ������ʮ������ֵ
		}
		catch (NumberFormatException e)//�����e����ʡ ��ʾ����Ķ���
		{
			System.out.println("�����ʽ");
		}
		System.out.println(Integer.toBinaryString(123)+"B");//ʮ��������2���Ʒ���
		System.out.println(Integer.toHexString(123)+"H");//ʮ��������16���Ʒ���
		System.out.println(Integer.toOctalString(123)+"O");//ʮ��������8���Ʒ���
	}
}
