//binding data with method to make your program secure is known as encapsulation.
class Human
{
   private int age  ;
   private String name  ;

   public int  getAge()
   {
    return age;

   }
   public void setAge(int a)
   {
    age =a;
   }
   public String  getName()
   {
    return name;

   }
   public void setName(String b)
   {
    name =b;
   }
}
class Driver
{
    public static void main(String[] args)
     {
        Human h = new Human();
        

        h.setAge(11);
        h.setName("Mansi Bisore");
         System.out.println(h.getAge());
        System.out.println(h.getName());
        
    }
}