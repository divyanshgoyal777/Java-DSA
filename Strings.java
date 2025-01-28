import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is " + fullName);

        // Length
        System.out.println("Length of your name is " + name.length());

        // charAt
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Character at index " + i + " is " + name.charAt(i));
        }

        // Compare
        System.out.print("Enter another name: ");
        String name2 = sc.nextLine();
        if (name.equals(name2)) {
            System.out.println("Both names are equal");
        } else {
            System.out.println("Both names are not equal");
        }

        // Substring
        System.out.println("First 3 characters of your name is " + name.substring(0, 3));

        // Uppercase and Lowercase
        System.out.println("Your name in uppercase is " + name.toUpperCase());
        System.out.println("Your name in lowercase is " + name.toLowerCase());

        // Replace
        System.out.println("Your name after replacing 'a' with 'o' is " + name.replace('a', 'o'));

        // Split
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence are:");
        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }
}
