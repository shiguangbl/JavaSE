package changYongLei;
class Teststring3{

	public static void main(String[] args) 
	{
		int count = 0;//�ж��ض��ַ������ֵĴ���
		String s = "hpululuhenanluluzhumadianlululanwululu";
		String aim = "lulu";
		int index = -1;
		while((index = s.indexOf(aim))!=-1){
			s = s.substring(index+aim.length());
			count++;
		}

		System.out.println("lulu���ֵĴ���Ϊ:"+count);
	}
}