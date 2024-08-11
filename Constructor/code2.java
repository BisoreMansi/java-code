package Constructor;

 class dog
{
   String breed;

   dog(String br)
   {
    breed = br;

   }  
  public void display(){
    System.out.println("Breed" + breed);
   }
}
class drive1
{
    public static void main(String[] args) {
        dog d = new dog("germanshepard");
        d.display();
        d.display();
    }
    
}
