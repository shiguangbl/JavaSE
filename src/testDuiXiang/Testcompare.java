package testDuiXiang;

class Hotel{
	private int amount,age;
	private String name;

	Hotel(){
		System.out.println("咱们结婚吧");
	}
	Hotel(int amount,String name){   // 加在前面的 this.翻译为  这个对象的XXX  
		this.amount = amount;        //哪个对象调用这个函数 其中的this就代表哪个对象
		this.name = name;
	}
	public void setAge(int age){   //。int为返回值类型  函数定义格式：修饰符 返回值类型 函数名(){...}
		this.age = age;
	}
	public int getAge(){           //返回值不为空的函数要加	return 返回的变量名; 
		return age;
	}
	public void speak(){
		System.out.println(amount+"   "+name);
	}
	public boolean compare(Hotel h2){   //输入数据以h2定义  类型为Hotel 返回类型为boolean类型
//		if(this.amount>h2.amount)         判断年龄大小
//			return true;
//		else
//			return false;
		return this.amount==h2.amount;  //判断是否同龄人
	}
}
public class Testcompare {

	public static void main(String[] args) {
		Hotel h = new Hotel(6,"mingming");
		Hotel h2 = new Hotel(5,"lulu");
		h.setAge(56); 
		System.out.println(h.compare(h2)); //调用compare函数输入数据为 hotel类型对象h2
	//	System.out.println("Age="h.getAge());
		h.speak();

	}
}
