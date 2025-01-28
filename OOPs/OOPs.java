class Pen {
    String color;
    String type;

    Pen(String color, String type) {
        System.out.println("Constructor called..");
        this.color = color;
        this.type = type;
    }

    public void penDetails() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class OOPs {
    public static void main(String args[]) {
        Pen pen1 = new Pen("blue", "pen");
        pen1.penDetails();

        Pen pen2 = new Pen("black", "ball");
        pen2.penDetails();
    }
}