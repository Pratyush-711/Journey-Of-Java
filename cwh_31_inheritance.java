     // Quick Quiz
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("Dog is barking");
    }
}

public class cwh_31_inheritance {

    public static void main(String[] args) {
        Dog dog =  new Dog();

        // Inherited Methods
        dog.eat();
        dog.sleep();
        // Dog's Own Method
        dog.barks();
    }
}
