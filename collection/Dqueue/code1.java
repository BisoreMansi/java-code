import java.util.ArrayDeque;
import java.util.Deque;


class Program1
{
    

    public static void main(String[] args) 
    {
        Deque <String> d1 = new ArrayDeque <> ();

        // d1.add("A");
        // d1.add("B");
        // d1.add("C");

        // d1.addLast("A");
        // d1.addLast("B");
        // d1.addLast("C");
        // d1.addLast("D");
        // d1.addLast("E");

        // d1.addFirst("a");
        // d1.addFirst("b");
        // d1.addFirst("c");
       System.out.println(d1);

       System.out.println(d1.peek());
       System.out.println(d1.peekFirst());
       System.out.println(d1.peekLast());
   
    //   System.out.println(d1.getLast()); 



        
    }
}