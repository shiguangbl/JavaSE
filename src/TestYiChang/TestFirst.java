package TestYiChang;
import java.io.*;
public class TestFirst {
	public static void main(String[] args) {
		int [] arr = {1,58,98};
		System.out.println(arr[2]);
		try{
			System.out.println(2/0);//在出现异常时  抛出一个对象
		}catch(ArithmeticException a){//a仅仅为一个变量名 可以任意起
			System.out.println("分母不能为零");
			a.printStackTrace();
		}
		FileInputStream in = null;
		
	    try {
	        in = new FileInputStream("myfile.txt");
	        int b;
	        b = in.read();
	        while (b != -1) {
	            System.out.print((char) b);
	            b = in.read();
	        }
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace(); 
	    } catch (IOException e) {
	      System.out.println(e.getMessage());
	    } finally {//此语句将在try内部出现Exception时直接跳出try后执行，并且没有出现异常时也会执行
	    	try {
	      	in.close();
	      } catch (IOException e) {
	      	e.printStackTrace();
	      }
	    }
	}
	void m(int i) throws ArithmeticException {//手动对异常的处理
		if(i==0) 
			throw new ArithmeticException("被除数为0");//此时使用throw
	}
	void f() throws FileNotFoundException , IOException {//此方法为必须要抛出异常的方法 在方法定义时使用throws 抛给调用它方法的去处理 本身就可不做相应的处理
		FileInputStream in = new FileInputStream("myfile.txt");
    int b;
    b = in.read();
    while (b != -1) {
        System.out.print((char) b);
        b = in.read();
    }
	}
	void f2() throws IOException {//使用throws 将异常抛出 不做处理
	/*	
		try {
			f();
		} catch (FileNotFoundException e) {     //注意捕捉异常的顺序 先catch小的异常 再catch大的异常
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		f();
	}

}
	
		
