// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee(101, "Ragini", 45000);
        Employee emp2 = new Employee(102, "Amit", 52000);
        Employee emp3 = new Employee(103, "Sneha", 48000);

        // Displaying employee information
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
