class A
{
    public void Sum()
    {
        System.out.println("overloading1");
    }
    public int Sum(int a, int b)
    {
        return a+b;
    }
     public int Sum(int a, int b,int c)
    {
        return a+b+c;
    }
     public double Sum(double a, double b,int c)
    {
        return a+b+c;
    }
    

}
class driver1
{
    public static void main(String[] args) 
    {
        A a = new A();
        System.out.println(a.Sum(10, 10));
          System.out.println(a.Sum(10,10,10));
          System.out.println(a.Sum(5.89,5,5));
    }
}