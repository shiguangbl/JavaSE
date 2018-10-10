package testCollection;
import java.util.*;
public class TestMap {
  public static void main(String args[]) {//自动打包,解包  是对象与数值的自动转换
    Map<String,Integer> m1 = new HashMap<String,Integer>();
    Map<String,Integer> m2 = new TreeMap<String,Integer>();
    //m1.put("one",new Integer(1));原始写法  键--值对  (对象1,对象二)
    m1.put("one", 1);             //自动打包
    //m1.put("two",new Integer(2));
    m1.put("two", 2);             //注意:此方法返回值是原先键two对应的对象
    //m1.put("three",new Integer(3));
    m1.put("three", 3);
    //m2.put("A",new Integer(1));
   	m2.put("A", 1);
    //m2.put("B",new Integer(2));
    m2.put("B", 2);
    m2.remove("A");				//根据键A 去除所对应的值
    System.out.println(m1.size());
    System.out.println(m1.containsKey("one"));//true
    System.out.println
        //(m2.containsValue(new Integer(1)));
        (m2.containsValue(1));//true
    System.out.println(m1);//{two=2, one=1, three=3}
    if(m1.containsKey("two")) {
      //int i = ((Integer)m1.get("two")).intValue();
      int i = m1.get("two");     //自动解包  注意:系统是将其转换后再解包
      System.out.println(i);//2
    }
    Map<String,Integer> m3 = new HashMap<String,Integer>(m1);
    m3.putAll(m2);
    System.out.println(m3);//{two=2, B=2, one=1, three=3}
  }
}