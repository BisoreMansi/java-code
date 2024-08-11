package Inheritance;
//hybrid inheritance
//using multilevel and hyrarical
class Grandfather
{
    void money()
    {
        System.out.println(" money");
    }
}
class father extends Grandfather
{
    void phone()
    {
        System.out.println("give phone");
    }
}
class son extends father
{
    void laptop()
    {
        System.out.println("give laptop");
    }
}
class daughter extends father
{
    void macbook()
    {
        System.out.println("give mackbook");
    }
}
class Driver
{
    public static void main(String[] args) {
        daughter d = new daughter();

    d.phone();
    d.money();
    d.macbook();
    
    }
    


}