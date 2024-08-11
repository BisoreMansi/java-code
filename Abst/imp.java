// The abstract keyword in Java is used in the context of classes and methods 
//to create a blueprint for other classes to follow.

// 1. Abstract Classes
// An abstract class is a class that cannot be instantiated on its own and
//  is meant to be subclassed. It can contain abstract methods (without implementations) 
//  as well as concrete methods (with implementations).

 abstract class Animal {
    abstract void makeSound(); // Abstract method (no implementation)

    void breathe() {           // Concrete method (with implementation)
        System.out.println("This animal is breathing.");
    }
}
class buffalo extends Animal
//  extends Animal
{
    

    void makeSound() {
        
        System.out.println("Im a baffole");
        
    }
    public static void main(String[] args) {
        buffalo b = new buffalo();
        b.makeSound();
        b.breathe();
        
    }

}

// Use Case:

// Abstract classes are useful when you want to define a common template for a
//  group of subclasses.
// They allow you to provide some default behavior while forcing subclasses 
// to provide specific implementations.