package SetInterface;

import java.util.HashSet;

public class code1 
{
    public static void main(String[] args) 
    {
        HashSet <String> h1 = new HashSet<>();

        h1.add("India");
        h1.add("Australia");
        h1.add("South africa");
        h1.add("India");
        h1.add("America");

        System.out.println("List  Contains India :"+h1.contains("India"));
        System.out.println(h1.remove("India"));
        System.out.println(h1.isEmpty());
        // System.out.println(h1.iterator());
        for(String s: h1)
        {
            System.out.println(s);
        }
        



        
    }
    
}
