//Abstract Method
//An abstract method is a method that is declared without an implementation.
// It must be implemented by subclasses of the abstract class.
abstract class Animal {
    abstract void makeSound(); // Abstract method
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
// class kitten extends Animal
// {

// }

// Use Case:

// Abstract methods enforce a contract that subclasses must follow, ensuring that specific behavior is provided by each subclass.
// They are used to define methods that must be implemented differently by each subclass.
