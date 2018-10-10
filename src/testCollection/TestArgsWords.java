package testCollection;
import java.util.*;
public class TestArgsWords {
  public static void main(String args[]) {
    Map<String,Integer> m = new HashMap<String,Integer>();
    String []s = {"aaa","bbb","aaa","aaa"};
    for (int i = 0; i < s.length; i++) {
      int freq = m.get(s[i])==null?0:m.get(s[i]);//空值无法自动解包
      m.put(s[i],freq == 0? 1 : freq+1);
    }
    System.out.println
        (m.size() + " distinct words detected:");
    System.out.println(m);
  }
}
