import java.util.HashMap;
import java.util.Map;

class Program1
{
    public static void main(String args[])
    {
        HashMap<String,Integer> h1 = new HashMap<>();
        h1.put("Mansi", 1001);
        h1.put("bhumi", 1002);
        h1.put("kajal", 1003);
        h1.put("payal", 1004);
        h1.put("sonali", 1005);
        // System.out.println(h1);

        // System.out.println(h1.size());
        // System.out.println(h1.get("sonali"));//is key pe konsi value h print krwao
        // h1.remove("sonali");//key ko remove krna h

        // System.out.println(h1.containsKey("payal"));
        // System.out.println(h1.containsValue(100));

        //How to Itrate in a HAshMap
       // Method 1: Using a for loop to iterate through a HashMap.
        // Iterating a HashMap through a for loop to use getValue() and getKey() functions.
        // for(Map.Entry<String,Integer> set : h1.entrySet())
        // {
        //     System.out.println(set.getKey() +" :"+set.getValue());

        // }
        
        h1.forEach((key,value)-> System.out.println(key + value));
        

    }
}