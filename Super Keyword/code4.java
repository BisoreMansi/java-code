 class Anu
  {
    Anu()
    {
        System.out.println("animal");
    }
    
}
class dog1 extends Anu
{
    dog1()
    {
        System.out.println("dog");
    }
}
class driver9{
    public static void main(String[] args) {
        dog1 d = new dog1();
    }
}