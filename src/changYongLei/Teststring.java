package changYongLei;
class Teststring {
	public static void main(String[] args) //String��ķ���
	{
		String s1 = "sun java";
		String s2 = "Sun Java";
		System.out.println(s1.charAt(1));//u					���ص�1���½Ǳ꣩���ַ�
		System.out.println(s2.length());//8			                            �����ַ�������
		System.out.println(s1.indexOf("java"));//4				���س���java�ĵ�һ��λ��
		System.out.println(s1.indexOf("Java"));//-1                                                 ���û�з���-1
		System.out.println(s1.equals(s2));//false				�ж������ַ��Ƿ���ͬ��java�Ѿ���equals������д��
//		System.out.println(s1 == s2);//false ��Ϊ�ж�����
		System.out.println(s1.equalsIgnoreCase(s2));//true		���Դ�Сдǰ���ж��ַ��Ƿ���ͬ

		String s3 = "���Ǽ���16-4��� ����ѧjava";
		String s33 = s3.replace('��','��'); 
		System.out.println(s33);//���Ǽ���16-4��� ����ѧjava			�滻�ض��ַ�
		
		String s4 = new String("Welcome To Java World!");
		System.out.println(s4.startsWith("Welcome"));//true				�жϿ�ʼ�ַ�
		System.out.println(s4.endsWith("Word"));//false					�жϽ�β�ַ�
		System.out.println(s4.toLowerCase());//welcome to java world!	��д��Сд
		System.out.println(s4.toUpperCase());//WELCOME TO JAVA WORLD!	Сд����д
		System.out.println(s4.substring(11));//Java World!				��ȡ������Ǳ�11�Ŀ�ʼ����β
		String s5 = "   sun java   ";
		System.out.println(s5.trim());//sun java						ȥ��ͷ��β�ո�
		
		Date d = new Date(2016,12,20);
		int i = 1234567;
//		String s6 = String.valueOf(d);//�˷������Դ���int double... �Լ��������
		String s7 = String.valueOf(i);//����ת�����ַ�
		System.out.println(String.valueOf(d));//"Year:Month:Day -- 2016-12-20
		System.out.println(s7);//1234567
		System.out.println(s7.length());//7
		String s8 = "binglu,man,19";
		String[]spilt = s8.split(",");//���ַ��еģ���ɷָ������зָ�  �ָ���Ӵ� �����ַ�������
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
