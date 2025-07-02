// Compile-time (method overloading)
class MathOp {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

// Runtime (method overriding)
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}
public class Main {
    public static void main(String[] args) {
        MathOp m = new MathOp();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
        Animal a = new Cat();
        a.sound();
    }
}