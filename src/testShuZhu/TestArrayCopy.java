package testShuZhu;
class TestArrayCopy 
{
	public static void main(String[] args) //����Ŀ������޸�+��ά����Ķ���
	{
		int [][]b = new int[][]{{12,32,45},{25,69,78,25},{12,36,65,45,89}};
		int [][]c = new int[2][];
		c[0] = new int[2];//��ά����Ķ����ʽ
		c[1] = new int[5];
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[1].length;j++){
				c[1][j] = j+1; 
			}
		}
		System.out.println(c[1][2]);
		String []a = {"mingming","dapeng","binglu","laofeng","shuaibo","ganggang"};
		String []d = new String[6];
		System.arraycopy(a,0,d,0,5);//{����Դ��Դ��ʼλ�ã�Ŀ�����飬Ŀ��������ʼλ�ã�����}
		for(int i=0;i<5;i++){
			System.out.println(d[i]);
		}
		System.out.println(" ");
		d[0] = "ao te man";
		System.out.println(a[0]);//��Ŀ����������޸� ��ı�Դ��������ݣ�����
	}
}

