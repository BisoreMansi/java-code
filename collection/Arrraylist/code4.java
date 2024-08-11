import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class code4 
{
    public static void main(String[] args) {
        
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"mansi","kuldeep","Palllavi");
        for(String i : list2)
        {
            System.out.println(i);
        }
        System.out.println(list2.clone());//Shallow copy
        Collections.sort(list2);
        
        System.out.println(list2);

    }
    
}
