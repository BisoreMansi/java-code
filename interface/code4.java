interface walkable
{
    void walk();
}
interface Swiming
{
    void Swim();
    void walk();
}
class Duck implements walkable ,Swiming
{
    public void Swim()
    {
        System.out.println("Swiming");
    }
    public void walk()
    {
        System.out.println("Walking");
    }
   

}
class driver4
{
    public static void main(String[] args) {
        Duck d = new Duck();
        d.Swim();
        d.walk();
    }
}