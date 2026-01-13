class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class CWH_PracticeSet_08_1 {

    public static void main(String[] args) {
        Employee pratyush = new Employee();
        pratyush.setName("Pratyush Manivansh");
        pratyush.salary = 1000;
        System.out.println(pratyush.getSalary());
        System.out.println(pratyush.getName());
    }
}
