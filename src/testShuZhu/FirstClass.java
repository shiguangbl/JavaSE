package testShuZhu;

public class FirstClass {

	public static void main(String[] args) {
//		Ԫ������[] ������ = new Ԫ������[����ĳ���];
//		int [] arr = new int[3];
//		arr[0] = 89;
//		arr[2] = 45;
//		System.out.println(arr[2]);
//		Ԫ������[] ������ = new Ԫ������ []{��ֵ1,��ֵ2,������};
//		int [] arr = new int[]{5,36,65};
//		Ԫ������[] ������ = {��ֵ1,��ֵ2,...};
/*		int [] arr = {89,86,56};
		int max = arr[0];
		for (int x =1;x<arr.length;x++)
		{
			if(arr[x]>arr[0])
				max = arr[x];
		}
 */
//		int []b = new int [5];
//		int []c = {1,56,69};
//	    if(args.length<9){
//            System.out.println( 
//              "Usage: java Test \"n1\" \"op\" \"n2\"");
//            System.exit(-1);
//	    }
//	    for(int i=0;i<args.length;i++){
//	    	a[i] = Integer.parseInt(args[i]);
//	    }
		int a[] = new int[]{1,5,6,4,8,7,3,9,2};
/*	    for(int i=0;i<a.length-1;i++)//ѡ������  �㷨������Ч
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[j]<a[i])
	    		{
	    			int temp = a[i];
	    			a[i] = a[j];
	    			a[j] = temp;
	    		}
	    	}
	    }
	    */
	/*	int k =0;//ѡ������  ��Ч�㷨
		for(int i=0;i<a.length-1;i++)
		{
			k = i;
	    	for(int j=k+1;j<a.length;j++)
	    	{
	    		if(a[j]<a[k])
	    		{
	    			k = j;
	    		}
	    	}
	    	int temp = a[i];
			a[i] = a[k];
			a[k] = temp;
	    }
	*/	
		for(int i=a.length-1;i>0;i--){//ð������ �����Ƚ� С�ı�һ��һ�ε��滻������ ����İ�˳������ײ�
			for(int j=0;j<i;j++){
			if(compare(a[j],a[j+1])>0){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			}
		}
		
	    for(int i=0;i<9;i++){
	    	System.out.println("a["+i+"]="+a[i]);
	    }
//		for(int i=0;i<args.length;i++){
//			System.out.println(args[i]);
//		}
	

}
	public static int compare(int a,int b){
		return a>b?1:0;
	}
}

 