package changYongLei;
class Teststring2 
{
	public static void main(String[] args) 
	{
		int lower = 0,upper = 0,other = 0;
		String s = "asdefVSv8654!^_^25GHjujf>11";
	/*	for(int i=0;i<s.length();i++){//判断字符个数 方法一
			char c =s.charAt(i);
			if(c>='a'&&c<='z'){
				lower++;
			}
			else if(c>='A'&&c<='Z'){
				upper++;
			}
			else{
				other++;
			}
		}
		*/
/*		for(int i=0;i<s.length();i++){   //方法二
			char c =s.charAt(i);
			if(Character.isLowerCase(c)){
				lower++;
			}
			else if(Character.isUpperCase(c)){
				upper++;
			}
			else{
				other++;
			}
			System.out.println("小写字母个数:"+lower+"大写字母个数:"+upper+"其他字符:"+other);
		}
	*/	
		String s2 = "abcdefghijklmnopqrstuvwxyz";//方法三
		String s3 = s2.toUpperCase();
		for(int i=0;i<s.length();i++){
			char c =s.charAt(i);
			if(s2.indexOf(c)!=-1){
				lower++;
			}
			else if(s3.indexOf(c)!=-1){
				upper++;
			}
			else{
				other++;
			}
		}
		
		System.out.println("小写字母个数:"+lower+"大写字母个数:"+upper+"其他字符:"+other);
	}
}
