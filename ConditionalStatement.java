import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than y");
        }

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are 18");
                break;
            case 20:
                System.out.println("You are 20");
                break;
            default:
                System.out.println("You are not 18 or 20");
        }
        sc.close();
    }
}
