package Inheritance;
//multilevel inheritance
 class Animal {
    public void eat(){
        System.out.println("I'm Eating Food");
    }
    public void seep(){
        System.out.println("I'm Selleping ");
    }
}
class Dog extends Animal
{
    public void sound(){
        System.out.println("I'm Give Barking Sound");
    }
  
}
class Cat extends Dog
{
    public void soundM(){
        System.out.println("I'm Give Meow Sound");
    }
  
}
class Driver
{
    public static void main(String[] args) {
        
       Cat c = new Cat();
       c.eat();
       c.sound();
       c.soundM();
       
    }

}