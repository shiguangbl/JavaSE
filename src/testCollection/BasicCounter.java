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
			return (firstname.equals(name.firstname))//调用了String（first）对象的equals方法
				&&(lastname.equals(name.lastname));
		}
		return super.equals(obj);//交给父类的equals方法去处理  即和 == 性质一样 判断是不是同一个对象
	}
	public int hashCode(){		//重写equals方法的同时要去重写hash code方法 因为使用索引比较的时候需要调用此方法进行比较
		return firstname.hashCode();//调用了String方法的hashCode()方法
	}
}
class BasicCounter 
{
	public static void main(String[] args) 
	{
		Collection c = new HashSet();//父类引用指向子类对象
		c.add("hello");//添加字符串     添加的必须是一个object
		c.add(new Name("冰路","王"));//添加对象
		c.add(new Integer(100));//添加封装int类型的对象
//		System.out.println(c.remove(new Name("冰路","王")));//true 
		System.out.println(c);//调用c的toString方法，其内部实现:调用每一个元素的toString方法,左右中括号中间逗号隔开
		
		c.add(new Name("f1","l1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("f3","l3"));
		Iterator i = c.iterator();
//		while(i.hasNext()){
//			Name n = (Name)i.next();//挨着取出容器内装的内容
//			System.out.println(n);
//		}
		Collection<Name> c2 = new HashSet<Name>();
		c2.add(new Name("fff1","lll"));
		c2.add(new Name("f2","l2"));
		c2.add(new Name("fff3","lll3"));
		for(Iterator<Name> i2 = c2.iterator();i2.hasNext();){
			Name a = i2.next();
			if(a.getFirstname().length()<3)
				i2.remove();//不能写成c.remove(a); 否则产生例外
		}                   //因为已将Name包装成了Iterator，所以只能调用Iterator的删除方法
		System.out.println(c2);
	}
}
