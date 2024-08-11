import java.util.ArrayDeque;
import java.util.Deque;

public class code2 
{
    public static void main(String[] args) 
    {
        Deque <Integer> d1 = new ArrayDeque<>() ;
      d1.addLast(1);
      d1.addLast(2);
      d1.addLast(3);
      d1.addLast(4);
      d1.addLast(5);

      d1.push(8);
      System.out.println(d1);
            
        
        
    }
    
}
