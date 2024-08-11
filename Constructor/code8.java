package Constructor;

//Copy Constructor
class complex 
{
    private double re,im;
    //Constructor1
    public complex(double re,double im)
    {
        this.re= re;
        this .im = im;
    }
      //Constructor2 Copy Constructor
      complex(complex c)
      {
        System.out.println("copy constructor called");
        re = c.re;
        im= c.im;
        // re = 42;
        // im=98;
      }
      public String toString()
      {
        return"(" + re + "+"+ im + "i"+")";
      }

}
class driver8
{
  public static void main(String[] args) 
  {
    complex c1 = new complex(10,19);
    complex c2 = new complex(c1);
    complex c3 = c2;
    System.out.println(c2);
    
  }
}
