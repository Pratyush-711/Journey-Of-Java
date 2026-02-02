class Monkey {
    void jump() {
        System.out.println("Monkey jump");
    }
    void bite() {
        System.out.println("Monkey bite");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello Sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class CWH_PracticeSet_11_2 {

    public static void main(String[] args) {
        // Solution of Qno-3
        Human pratyush = new Human();
        pratyush.sleep();
        pratyush.eat();
        pratyush.speak();
        pratyush.jump();

        // Solution of Qno-5
        Monkey m1 =  new Human();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
        m1.jump();
        m1.bite();

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> Error
        lovish.eat();
        lovish.sleep();
    }
}
