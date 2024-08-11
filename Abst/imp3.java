// 4. Abstract Classes and Variables
// Abstract classes can have instance variables just like any other class. These variables can be used in the abstract class and its subclasses.

// Syntax:

// java
// Copy code
abstract class Animal {
    String name = "mansi";
    abstract void makeSound();
    
    void display() {
        System.out.println("This is " + name);
    }
}

class Dog extends Animal {
   
    void makeSound() {
        System.out.println("Woof");
    }
}
class Radhika{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
// Use Case:

// Instance variables in abstract classes can hold state that is common to all subclasses.
// They can be accessed and modified by methods in the abstract class and its subclasses.