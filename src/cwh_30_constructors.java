class MyMainEmployee {
    private int id;
    private String name;

//    public MyMainEmployee() {
//        id = 45;
//        name = "Your-Name-Here";
//    }
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }
}

public class cwh_30_constructors {

    public static void main(String[] args) {
        MyMainEmployee emp = new MyMainEmployee("Pratyush Manivansh", 12);
        // emp.setName("Code With Harry");
        // emp.setId(100);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
