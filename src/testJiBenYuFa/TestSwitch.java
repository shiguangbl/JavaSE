package testJiBenYuFa;

public class TestSwitch {
	public static void main(String[] args) {
		
	getmouth(86);//���ڷ���ֵΪ�յĺ��� ֱ�Ӵ�����Ӻ��������ֽ��е���  ������Ϊ��Ҫ���뵽�Ӻ���������(Ҳ����Ϊ��)

	}
	public static void getmouth(int mouth)//��װһ���ж��·ݵĺ���
	{

		switch (mouth)//��������(���������)���������case�����ж�
		{	
			
			case 3:   //ҪС��case��͸: һ������һ��case�ж�ͨ��������������case���ж�ֱ��ִ��case�µ����
			case 4:
			case 5:
				System.out.println(mouth+"���Ǵ���");
				break;/*���е������ʱ��������switch     ��һ��������ʽΪ����˳��ִ�е� } ����
				                   ��������е�case��������ʱ��ȥѰ�Ҳ�ִ��default��� ������û��break���ʱ������˳����
				                   ������������в��жϾ�ִ��case�����  ֱ����break����}ʱ������switch           
				       */
			case 6:
			case 7:
			case 8:
				System.out.println(mouth+"�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(mouth+"�����＾");
				break;
			case 12:
			case 13:
			case 14:
				System.out.println(mouth+"���Ƕ���");
			default	://�����Ҫ��ǰ������case����жϺ��û�ж�Ӧʱ�Ž��д����  ���Ҳ�������λ��
				System.out.println("û�ж�Ӧ�ļ���");

		}
	}
}
