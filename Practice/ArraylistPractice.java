import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//WJP to create array list add some colours (String)print out the collection
class Practice1 
{
    public static void main(String args[])
    {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("purple","black","orange","yelllow"));
        //WJP to create array list add some colours (String)print out the collection
        // for(String s : l1)
        // {
        //     System.out.print(s +" ");
        // }

        // Second Solution
        //  for(String s : l1)
        // {
        //     System.out.println(s );
        // }

        //Third solution
        // l1.set( 0,"white");

        //Fourth Solution
        // System.out.println(l1.get(1));

        //Five Solution
        // l1.add(0,"red");
        // System.out.println(l1);

        //Sixth Solution
        // l1.remove(3);

        //Siven Solution
        // l1.contains("purple");

        //Eight Solution
        
            
            // l1.sort(Comparator.naturalOrder());
        
        // System.out.println(l1);
        //Nine Solution
        ArrayList<String> l2 = new ArrayList<>();
        // l2=l1;
        // System.out.println(l2);
        
        //ten Solution suffle
        // Collections.shuffle(l1);
        // System.out.println(l1);

        //eleven Solution
      
        // Collections.reverse(l1);
        // System.out.println(l1);
        
        //twelve Solution
        // System.out.println(l1.equals(l2));

        //thirteen Solution
        Collections.swap(l1, 1, 3);
        System.out.println(l1);

        //Fourteen Solution
        l1.trimToSize();

        //15th Solution
        for(int i=0; i<l1.size(); i++)
        {
            System.out.println("index ="+ i + " "+l1.get(i));
        }
        
     




    }
}