/**
 * code1
 */
@FunctionalInterface
 interface Exp
  {
    void show();
    
    default void data()
    {
        System.out.println("Data");
    }

    
}
 class demo 
{
    // public void show()
    // {
    //     System.out.println("Im child");
    // }
    public static void main(String args[])
    {
       
        Exp imp =()-> System.out.println("We are child");
        imp.show();
        imp.data();
        System.out.println(imp);
    }

  

   
}