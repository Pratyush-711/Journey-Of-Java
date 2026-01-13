// Quick Quiz
class MyMainEmployee {
    private int id;
    private String name;
    private double salary;


    // Constructor 1: Name & ID (salary defaults to 10000)
    public MyMainEmployee(String myName, int myId) {
        name = myName;
        id = myId;
        salary = 10000;
    }

    // Constructor 2: Name, ID & Salary (overloaded constructor)
    public MyMainEmployee(String myName, int myId, double mySalary) {
        name = myName;
        id = myId;
        salary = mySalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
}

public class cwh_30_constructors {

    public static void main(String[] args) {
        // Use default salary = 10000
        MyMainEmployee emp1 = new MyMainEmployee("Pratyush Manivansh", 113);

        // Use custom salary
        MyMainEmployee emp2 = new MyMainEmployee("Code With Harry", 101, 25000);

        System.out.println(emp1.getName());
        System.out.println(emp1.getId());
        System.out.println(emp1.getSalary());

        System.out.println();

        System.out.println(emp2.getName());
        System.out.println(emp2.getId());
        System.out.println(emp2.getSalary());
    }
}