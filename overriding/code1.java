package overriding;

class A
{
    public int dob(int d,int m)
    {
        
        System.out.println(d+"-"+ m +"-");
        return 0;
    }


    
}
class B extends A
{
    public int dob(int d,int m,int y)
    {
        System.out.println(d+"-"+ m +"-" + y);
        return 0;
    }
}
class driver1
{
    public static void main(String[] args)
     {
        B b = new B();
        b.dob(19, 05,2002);
    }

}