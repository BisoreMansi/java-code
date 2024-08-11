package linklistCol;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class code1
 {
    public static void main(String args[])
    {
        LinkedList <String> l1 = new LinkedList<>();
        l1.add("java");
        l1.add("python");
        l1.add("Ruby");
        l1.add("Html");
        l1.addFirst("Rails");
 
        System.out.println(       l1.getLast());
        System.out.println(l1.getFirst());
        System.out.println(l1.clone());
        System.out.println(l1.getClass());
        // l1.clear();
        // System.out.println(l1.hashCode());
        System.out.println(l1);
        
        
       
        l1.set(4, "Golang");
        l1.add("css");
        
        System.out.println(l1);
        //How to convert Linkedlist unmutable
        List<String> l2 =  Collections.unmodifiableList(l1);
        l1.add("mansi");
        System.out.println(l2);
    }
    
}
