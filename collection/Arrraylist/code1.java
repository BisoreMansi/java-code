import java.util.ArrayList;

class Code1
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("c");
        list.add("Python");
        list.add(2,"Ruby");//add at a particular index

        // System.out.println(list);
      System.out.println( list.get(0)); //Know the value of index
      list.set(0,"Golang");//set the value remove by
       System.out.println(list);
       list.remove(2);//remove the element
       System.out.println(list.contains("Python"));//Value Present or not
    //    list.clear();//clear the all elements
    //   System.out.println( list.isEmpty());

// for(int i=0; i<list.size(); i++)
// {
//     System.out.print(list.get(i));
// }
    for(String i : list)
    {
        System.out.println(i);
    }
       System.out.println(list);

    }

}