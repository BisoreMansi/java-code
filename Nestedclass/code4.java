

 class Outer4 {

    Outer4()
    {
        System.out.println("Outer Class Constructor") ;
    }

    {
        System.out.println(" Outer class Instance Block") ;
    }

    static 
    {
        System.out.println("Outer class Static Block");
    }

    class Inner{
        Inner()
        {
            System.out.println("Inner Class Constructor");

        }

        {
            System.out.println("Inner Class instace Block");
        }
    }

    public static void main(String[] args)
    {
        new Outer4().new Inner() ;
    }
    
}