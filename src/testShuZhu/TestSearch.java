package testShuZhu;
class  TestSearch
{
	public static void main(String[] args) //二分法  前提:顺序已经排好
	{
		int []a = {8,9,12,56,78,98,125,369};
		System.out.println(search(a));
	}
	public static int search(int []a){
		if(a.length == 0)
			return -1;
		int start = 0;
		int end = a.length - 1;
		int midd = (start + end)/2;
		while(start<=end){
			if(a[midd] == 98){
				return midd;
			}
			else{
				if(a[midd]>98){
					end = midd - 1;
				}
				if(a[midd]<98){
					start = midd + 1;
				}
				midd = (start + end)/2;
			}			
		}
		return -1;
	}
}
