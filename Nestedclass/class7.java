class Outer7 
{
    void m1()
    {
        for(int i=0; i<=5; i++)
        {
            class Inner7
            {
                void Display()
                {
                    System.out.println("infobeans");
                }
          

            }
            Inner7 j = new Inner7();
            j.Display();
        }
    }
    public static void main(String[] args) {
        Outer7 o = new Outer7();
        o.m1();
    }
    
}
