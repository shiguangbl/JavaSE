package testCollection;
import java.util.*;
public class TestMap {
  public static void main(String args[]) {//�Զ����,���  �Ƕ�������ֵ���Զ�ת��
    Map<String,Integer> m1 = new HashMap<String,Integer>();
    Map<String,Integer> m2 = new TreeMap<String,Integer>();
    //m1.put("one",new Integer(1));ԭʼд��  ��--ֵ��  (����1,�����)
    m1.put("one", 1);             //�Զ����
    //m1.put("two",new Integer(2));
    m1.put("two", 2);             //ע��:�˷�������ֵ��ԭ�ȼ�two��Ӧ�Ķ���
    //m1.put("three",new Integer(3));
    m1.put("three", 3);
    //m2.put("A",new Integer(1));
   	m2.put("A", 1);
    //m2.put("B",new Integer(2));
    m2.put("B", 2);
    m2.remove("A");				//���ݼ�A ȥ������Ӧ��ֵ
    System.out.println(m1.size());
    System.out.println(m1.containsKey("one"));//true
    System.out.println
        //(m2.containsValue(new Integer(1)));
        (m2.containsValue(1));//true
    System.out.println(m1);//{two=2, one=1, three=3}
    if(m1.containsKey("two")) {
      //int i = ((Integer)m1.get("two")).intValue();
      int i = m1.get("two");     //�Զ����  ע��:ϵͳ�ǽ���ת�����ٽ��
      System.out.println(i);//2
    }
    Map<String,Integer> m3 = new HashMap<String,Integer>(m1);
    m3.putAll(m2);
    System.out.println(m3);//{two=2, B=2, one=1, three=3}
  }
}