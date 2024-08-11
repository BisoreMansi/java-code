package Constructor;

 class Flower
{
    String type;
   
    Flower(String type)
    {
       this.type = type;
       System.out.println("Parametirized Calling ");

    }
    Flower()
    {
        System.out.println("rose Smell");
        System.out.println("Default Calling ");
    }
    public void showdata()
    {
        System.out.println(type + " Smell");
        
    }
}
class driver4
{
    public static void main(String[] args) {
        Flower f = new Flower("jasmin");
        Flower f1= new Flower();
    f.showdata();
    f1.showdata();
    }
 
    
}
