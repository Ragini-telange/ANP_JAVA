// Base class
class Person {
    void showInfo() {
        System.out.println("I am a person.");
    }
}

// First interface (renamed to avoid conflict)
interface StudentRole {
    void study();
}

// Second interface
interface Artist {
    void draw();
}

// Class demonstrating hybrid inheritance
class MultiTalentedStudent extends Person implements StudentRole, Artist {
    public void study() {
        System.out.println("I study computer science.");
    }

    public void draw() {
        System.out.println("I love to draw in my free time.");
    }
}

// Main class
public class HybridDemo
 {
    public static void main(String[] args) {
        MultiTalentedStudent mts = new MultiTalentedStudent();
        
        mts.showInfo();  // From Person class
        mts.study();     // From StudentRole interface
        mts.draw();      // From Artist interface
    }
}
