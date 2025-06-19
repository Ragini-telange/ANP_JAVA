// Base class
class Student {
    void study() {
        System.out.println("Student studies");
    }
}

// Derived class
class CollegeStudent extends Student {
    void attendLecture() {
        System.out.println("College student attends lectures");
    }
}

// Further derived class
class EngineeringStudent extends CollegeStudent {
    void doProject() {
        System.out.println("Engineering student is doing a project");
    }
}

// Main class
public class StudentInheritance {
    public static void main(String[] args) {
        // Creating object of the most derived class
        EngineeringStudent enggStudent = new EngineeringStudent();

        // Accessing methods from all levels of inheritance
        enggStudent.study();          // From Student class
        enggStudent.attendLecture();  // From CollegeStudent class
        enggStudent.doProject();      // From EngineeringStudent class
    }
}
