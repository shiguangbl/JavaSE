package TestYiChang;
import java.io.*;
public class TestFirst {
	public static void main(String[] args) {
		int [] arr = {1,58,98};
		System.out.println(arr[2]);
		try{
			System.out.println(2/0);//�ڳ����쳣ʱ  �׳�һ������
		}catch(ArithmeticException a){//a����Ϊһ�������� ����������
			System.out.println("��ĸ����Ϊ��");
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
	    } finally {//����佫��try�ڲ�����Exceptionʱֱ������try��ִ�У�����û�г����쳣ʱҲ��ִ��
	    	try {
	      	in.close();
	      } catch (IOException e) {
	      	e.printStackTrace();
	      }
	    }
	}
	void m(int i) throws ArithmeticException {//�ֶ����쳣�Ĵ���
		if(i==0) 
			throw new ArithmeticException("������Ϊ0");//��ʱʹ��throw
	}
	void f() throws FileNotFoundException , IOException {//�˷���Ϊ����Ҫ�׳��쳣�ķ��� �ڷ�������ʱʹ��throws �׸�������������ȥ���� ����Ϳɲ�����Ӧ�Ĵ���
		FileInputStream in = new FileInputStream("myfile.txt");
    int b;
    b = in.read();
    while (b != -1) {
        System.out.print((char) b);
        b = in.read();
    }
	}
	void f2() throws IOException {//ʹ��throws ���쳣�׳� ��������
	/*	
		try {
			f();
		} catch (FileNotFoundException e) {     //ע�Ⲷ׽�쳣��˳�� ��catchС���쳣 ��catch����쳣
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		f();
	}

}
	
		
