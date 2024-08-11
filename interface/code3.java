// class - class - extends
// class - interface - implements
// interface - interface - extends
interface A 
{
    void show();
    void config();
    
}
interface X
{
    void run();
}
interface Y extends X{

}
class B implements A,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("in runing");
    }
}

class driver3
{
    public static void main(String[] args)
     {
        B b = new B();
        b.config();
        b.show();
        b.run();
        // A a = new B();
        // a.config();
        // a.show();
        // a.run();
        
    }
}