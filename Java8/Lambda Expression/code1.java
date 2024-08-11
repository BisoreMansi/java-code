
 interface Add
 {
    void add();
    
}
class code1
{
    //  void add(int a, int b)
    //     {
    //         System.out.println((a+b));
    //     }

    
    public static void main(String[] args) 
    {
        // (a,b) ->
        //     System.out.println(a+b);
        
        // code1 c = new code1();
        // c.add(3, 4);
        Add a = ()-> {
            System.out.println("lambda expression");
            
        };

        a.add();
        
    }

}
