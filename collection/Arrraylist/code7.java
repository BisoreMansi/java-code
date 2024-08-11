import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class code7 
{
    //How to Create Unmodifiable Arraylist
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,3,4,6));
        // Collections.unmodifiableList(l1).add(12);
        List<Integer> l2 = Collections.unmodifiableList(l1);
        System.out.println(l1);



    }
    
}
