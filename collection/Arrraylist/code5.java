import java.util.ArrayList;
import java.util.Arrays;

class Methodarray
{
    public static void main(String args[])
    {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("mango","banana","apple","pomegranate","straberry"));
        l1.add(1,"vanila");
        // System.out.println(l1.clone());
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("potato","tamato","bringal","mango","finger"));
        l1.addAll(l2);//add list1 then list2
        l1.addAll(3,l2); //add list2 add position of 3
        l1.ensureCapacity(10000);//l1 arraylist hold minimum elememt 10000
        l1.forEach((n)->System.err.println(n));
        l1.remove("mango");//first occurance delet
        
        l1.removeAll(l2);
        l1.removeIf(n -> (n=="apple"));
       System.out.println( l1.getClass());
    //    String removed = l1.removeFirst();
    System.out.println(l1.equals(l2));
        System.out.println(l1);
        // System.out.println(l1.lastIndexOf("mango"));
    }
}
