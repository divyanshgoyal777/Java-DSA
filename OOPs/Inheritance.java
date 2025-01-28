class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(5, 10);
        Circle c1 = new Circle();
        c1.area();
        c1.area(10);
    }
}
