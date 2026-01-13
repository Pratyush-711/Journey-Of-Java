class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }
}

public class cwh_29_ch9 {

    public static void main(String[] args) {
        MyEmployee pratyush =  new MyEmployee();

         // pratyush.name = "Pratyush Manivansh";
         // pratyush.id = 113; --> Throws an error due to private access modifier
        pratyush.setName("Pratyush Manivansh");
        System.out.println(pratyush.getName());

        pratyush.setId(851210);
        System.out.println(pratyush.getId());
    }
}
