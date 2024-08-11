interface fruits
{
    public void sweet();
}
class mango implements fruits
{
    String colour;
    public mango(String colour)
    {
        this.colour=colour;
    }
    public void sweet()
    {
        System.out.println("Colour of mango"+colour);
    }
}
class banana implements fruits
{
    String taste;
    public banana(String taste)
    {
       this.taste =taste;
    }
    
    public void sweet()
    {
        
        System.out.println("taste of banana"+taste);
    }
}
class Driver1
{
    public static void main(String[] args) {
        mango m = new mango("yellow");
        m.sweet();

        banana b = new banana("sweet");
        b.sweet();
    }
}