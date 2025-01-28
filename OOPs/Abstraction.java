abstract class Animal { // No use for user
    abstract void walk();
    public void eat() {
        System.out.println("Eating...");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}
