class Student {
    String name;
    char grade;

    Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public void studentInfo(String name) {
        System.out.println("Student name is: " + name);
    }

    public void studentInfo(char grade) {
        System.out.println("Student grade is: " + grade);
    }

    public void studentInfo(String name, char grade) {
        System.out.println("Student name and grade is " + name + " and " + grade + " respectively");
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        Student s1 = new Student("Divyansh", 'A');
        Student s2 = new Student("Ram", 'B');
        s1.studentInfo(s1.name, s1.grade);
        s2.studentInfo(s2.name);
    }
}