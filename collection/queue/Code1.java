import java.util.LinkedList;
import java.util.Queue;

class Program
{
    public static void main(String[] args) {
        Queue <String> q1 = new LinkedList<>();
        q1.add("Appple");
        q1.add("banana");
        q1.add("Orange");
        q1.add("Guava");
        q1.add("mango");
        q1.add("papaya");
        // System.out.println(q1);

        System.out.println(q1.peek());//return first value if not empty
        System.out.println(q1.element());
        q1.offer("Graps");
        // System.out.println(q1);
        q1.poll();//Remove head value
        // System.out.println(q1);

        q1.remove();//head vlaue remove
          System.out.println(q1);

    }
}