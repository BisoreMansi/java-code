abstract class Shape 
{
    String color;
   abstract double  area();
   public void getcolor()
   {
    System.out.println(color+"color");
   }

    
}

class rectangle extends Shape
{
    double area()
    {
        System.out.println("in rectangle");
        return 23;
    }

}
class driver
{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.area();
        r.getcolor();
    }
}