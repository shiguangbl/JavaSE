package testShuZhu;
class TestArrayCopy 
{
	public static void main(String[] args) //数组的拷贝及修改+二维数组的定义
	{
		int [][]b = new int[][]{{12,32,45},{25,69,78,25},{12,36,65,45,89}};
		int [][]c = new int[2][];
		c[0] = new int[2];//二维数组的定义格式
		c[1] = new int[5];
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[1].length;j++){
				c[1][j] = j+1; 
			}
		}
		System.out.println(c[1][2]);
		String []a = {"mingming","dapeng","binglu","laofeng","shuaibo","ganggang"};
		String []d = new String[6];
		System.arraycopy(a,0,d,0,5);//{复制源，源起始位置，目标数组，目标数组起始位置，长度}
		for(int i=0;i<5;i++){
			System.out.println(d[i]);
		}
		System.out.println(" ");
		d[0] = "ao te man";
		System.out.println(a[0]);//对目标数组进行修改 会改变源数组的数据？？？
	}
}

