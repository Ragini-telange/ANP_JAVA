
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Cat extends Animal {
    void meow() {
        System.out.println("The cat says: Meow!");
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
    
        Cat myCat = new Cat();

        // Accessing parent class method
        myCat.eat();

        // Accessing child class method
        myCat.meow();
    }
}