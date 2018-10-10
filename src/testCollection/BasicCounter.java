package testCollection;
import java.util.*;
class Name
{
	private String firstname,lastname;
	public Name(String firstname,String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname(){return firstname;}
	public String getLastname(){return lastname;}
	public String toString(){
		return firstname+" "+lastname;
	}
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name = (Name)obj;
			return (firstname.equals(name.firstname))//������String��first�������equals����
				&&(lastname.equals(name.lastname));
		}
		return super.equals(obj);//���������equals����ȥ����  ���� == ����һ�� �ж��ǲ���ͬһ������
	}
	public int hashCode(){		//��дequals������ͬʱҪȥ��дhash code���� ��Ϊʹ�������Ƚϵ�ʱ����Ҫ���ô˷������бȽ�
		return firstname.hashCode();//������String������hashCode()����
	}
}
class BasicCounter 
{
	public static void main(String[] args) 
	{
		Collection c = new HashSet();//��������ָ���������
		c.add("hello");//����ַ���     ��ӵı�����һ��object
		c.add(new Name("��·","��"));//��Ӷ���
		c.add(new Integer(100));//��ӷ�װint���͵Ķ���
//		System.out.println(c.remove(new Name("��·","��")));//true 
		System.out.println(c);//����c��toString���������ڲ�ʵ��:����ÿһ��Ԫ�ص�toString����,�����������м䶺�Ÿ���
		
		c.add(new Name("f1","l1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("f3","l3"));
		Iterator i = c.iterator();
//		while(i.hasNext()){
//			Name n = (Name)i.next();//����ȡ��������װ������
//			System.out.println(n);
//		}
		Collection<Name> c2 = new HashSet<Name>();
		c2.add(new Name("fff1","lll"));
		c2.add(new Name("f2","l2"));
		c2.add(new Name("fff3","lll3"));
		for(Iterator<Name> i2 = c2.iterator();i2.hasNext();){
			Name a = i2.next();
			if(a.getFirstname().length()<3)
				i2.remove();//����д��c.remove(a); �����������
		}                   //��Ϊ�ѽ�Name��װ����Iterator������ֻ�ܵ���Iterator��ɾ������
		System.out.println(c2);
	}
}
