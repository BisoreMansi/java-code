import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Practice 
{
    public static void main(String[] args) 
    {
        Set s1 = new HashSet<>();
        s1.add("Apple");
        s1.add("mango");
        s1.add("papaya");
        s1.add("blue barries");
        // que1 answer
        System.out.println(s1);

          // que2 answer
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

          // que3 answer
        System.out.println(s1.size());

          // que4 answer
        // s1.clear();
       
          // que5 answer
        System.out.println(s1.isEmpty());

          // que6 answer
          Set s2 = new HashSet<>();
          s2=s1;
          s2.add("Orange");
          System.out.println(s2);

            // que7 answer
            String l1[] = new String[s1.size()];
            s1.toArray(l1);
          for (String s : l1)
          {
            System.out.print(s+" ");
          }

          //Que8 answer
          TreeSet<String> ts = new TreeSet<>(s1);
          for (String s : ts)
          {
            System.out.println(s+" ");
          }

          //Que9 answer

          TreeSet<Integer> t1 = new TreeSet<>();
          t1.add(12);
          t1.add(45);
          t1.add(5);
          t1.add(1);
          for (Integer s : t1)
          {
            if(s<=7)
            System.out.println(s+" ");
          }


          //Que10 Answer
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s1.equals(s2));
        
    }
}