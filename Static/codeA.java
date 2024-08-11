//Use of static keyword
//= when we are using static keyword with variable, block, method it become
//independent of object. 

// Four place we can use static keyword 
// a) before variable declaration e.g 
//class Calc
// {
//      static int s;
//      }

// b) before a block  class Calc{  static {System.out.println("this is static block);}}

// c) during method creation class Calc{public static void add(int num1,int num2){};}

// d) with concept of inner class (It is not discussed in this lecture) 
// class OuterClass {
//   int x = 10;

//   static class InnerClass {
//     int y = 5;
//   }
// }


// Remember one thing:
// i)we can use static property, member inside non static block or method without object creation.
// ii) But we cannot use non static property or method inside static block or method without object creation.

class Mobile
{
   static String  network ;
    String brand;
    int price;
    String name;

    public void show()
        {
            System.out.println("my phone"+brand +"modal"+name+"price ="+price +"with network "+network);
        }
       

    public static void main(String[] args) 
    {
        
        Mobile m = new Mobile();
        m.brand="vivo";
        m.name="y21";
        m.price=12300;
        network="Airtel";
        m.show();
        network ="jio";
        System.out.println(network);
        
       

        
        
    }

}