package changYongLei;
class TestEnum 
{
	public enum MyColor{black,red,yellow}//ö�ٵĶ���

	public static void main(String[] args) 
	{
		MyColor c = MyColor.black;//ö�ٵĵ���
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
		System.out.println(c);//black      ����ӡ������������
	}
}
