// Class declaration
public class Student {
    // Properties (Data Members)
    String name;
    int rollNo;
    String course;

    // Method to display student details
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }

    // Main method
    public static void main(String[] args) {
        // Creating object of Student class
        Student s1 = new Student();

        // Initializing object data
        s1.name = "Ragini";
        s1.rollNo = 55;
        s1.course = "B.Tech in CS";

        // Calling method
        s1.displayInfo();
    }
}
