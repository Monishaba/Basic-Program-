class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
    void sleep() {
        System.out.println("Animal sleeps.");
    }
}
class Bird extends Animal {
    void eat() {
        System.out.println("Bird pecks at grains.");
    }
    void sleep() {
        System.out.println("Bird sleeps in its nest.");
    }
    void fly() {
        System.out.println("Bird flies in the sky.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
