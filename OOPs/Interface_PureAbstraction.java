interface Animal {
    void walk();

    void eat();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

public class Interface_PureAbstraction {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}
