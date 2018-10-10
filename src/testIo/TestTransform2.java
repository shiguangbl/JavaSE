package testIo;

import java.io.*;

class  TestTransform2
{
	public static void main(String[] args) 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String s = br.readLine();
			while(s != null){
				if(s.equalsIgnoreCase("exit"))
					break;
				else{
					System.out.println(s.toUpperCase());
				}
				s = br.readLine();
			}
			br.close();
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
