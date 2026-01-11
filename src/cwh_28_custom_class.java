class Employee {
    int id;
    String name;
    int salary;
    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class cwh_28_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Pratyush = new Employee(); // Instantiating a new Employee Object
        Employee John = new Employee(); // Instantiating a new Employee Object
        // Setting Attributes
        Pratyush.id = 113;
        Pratyush.name = "Pratyush Manivansh";
        Pratyush.salary = 2000;

        John.id = 112;
        John.name = "John Smith";
        John.salary = 3000;

        // Printing the attributes
        Pratyush.printDetails();
        John.printDetails();
        int salary = Pratyush.getSalary();
        System.out.println(salary);
          // System.out.println(Pratyush.id);
          // System.out.println(Pratyush.name);

    }
}
