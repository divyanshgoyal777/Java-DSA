import java.util.*;

public class Varibale {
    public static void main(String[] args) {
        int age = 17;
        double salary = 100000.0;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Divyansh Goyal";
        System.out.println("Hello World");
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I earn " + salary + " per month");
        System.out.println("My grade is " + grade);
        System.out.println("Am I a student? " + isStudent);
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("Hello " + name1);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        sc.close();
    }
}
