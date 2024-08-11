package Constructor;

 class geek 
{
    geek(String name)
    {
        System.out.println("your name "+ name);
    }
    geek(String name ,int age)
    {
        System.out.println("your name "+ name+ "your age "+ age);
    }
    geek(long id)
    {
        System.out.println("your id"+ id);
    }
    
}
class gfg
{
    public static void main(String[] args) 
    {
        geek g1 = new geek("shikha");
        geek g2 = new geek("mahima",87);
        geek g3 = new geek(123456);
        
    }
}
