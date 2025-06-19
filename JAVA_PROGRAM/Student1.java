class Student1 {
    // Data members
    String name;
    int age;

    // Parameterized Constructor
    Student1(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student1 s1 = new Student1("Ragini", 20);
        Student1 s2 = new Student1("Ram", 22);
        Student1 s3 = new Student1("Rohan", 21);

        System.out.println("Student s1");
        s1.display();
        System.out.println("Student s2");
        s2.display();
        System.out.println("Student s3");
        s3.display();
    }
}
