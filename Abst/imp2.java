// 3. Constructors in Abstract Classes
// Although you cannot instantiate an abstract class, it can have constructors. These constructors can be called when a subclass is instantiated.

// Syntax:


abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println(name);
    }

    abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Woof");
    }
}
class drive{
    public static void main(String[] args) {
        Dog d = new Dog("gimmy");
        d.makeSound();
    }
}
// Use Case:

// Constructors in abstract classes are used to initialize common properties 
//for subclasses.
// They can set up necessary state for the abstract class and its subclasses.