class parent
{
    void showdata (){
System.out.println("beautiful");
    }
}
class child extends parent
{
   void work ()
{
   super.showdata();
}
    
}
class driver
{
   public static void main(String[] args) {
    child c = new child();
    c.showdata();
   }

}

