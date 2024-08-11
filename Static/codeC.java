//static block

// static block vs non static block
// = remember static block executed before the execution of static method 
// = non static block executed when you try to create the object and executed before constructor called.

class shiv
{
    static{
        System.out.println("Good Morning");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("shiv");
    }
}
