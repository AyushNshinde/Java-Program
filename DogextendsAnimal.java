// Abstract class
abstract class Animal {
    abstract void sound();
}

// Interface
interface Vehicle {
    void drive();
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}

class Car implements Vehicle {
    public void drive() { System.out.println("Driving car"); }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Vehicle v = new Car();
        v.drive();
    }
}
