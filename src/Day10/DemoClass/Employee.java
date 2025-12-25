// here we are making two different classes in out project ( first class -> Employee  second class -> Main)
package DemoClass;
public class Employee {
    // declaring variables
    int emp_id;
    String name;
    String dept;
    float salary;
    // method to initialize the variables
    void add_info(int id, String n, String d, float sal) {
        this.emp_id = id;
        this.name = n;
        this.dept = d;
        this.salary = sal;
    }
    // method to display the employee details
    void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + dept);
        System.out.println("Employee Salary: " + salary);
    }
}
class Main {
    public static void main(String[] args) {
        // creating objects of class Employee
        Employee e1 = new Employee();
        e1.add_info(101, "Peter", "Salesforce", 45000);
        Employee e2 = new Employee();
        e2.add_info(102, "John", "Tax Consultant", 25000);
        Employee e3 = new Employee();
        e3.add_info(103, "Anna", "Development", 55000);
        // calling the display method
        e1.display();
        e2.display();
        e3.display();
    }
}