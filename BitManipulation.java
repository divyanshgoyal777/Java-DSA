import java.util.*;

public class BitManipulation {
    public static void main(String args[]) {
        // Get Bit

        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // if ((bitMask & n) == 0) {
        // System.out.println("Bit is zero");
        // }
        // else {
        // System.out.println("Bit is one");
        // }

        // Set Bit

        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;
        // int newNum = bitMask | n;
        // System.out.println(newNum);

        // Clear Bit

        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notOfn = ~(bitMask);
        // int newNum = notOfn & n;
        // System.out.println(newNum);

        // Update Bit
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        // operation = 1 : set
        // operation = 0 : clear
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        if (operation == 1) {
            // Set
            int newNum = bitMask | n;
            System.out.println(newNum);
        } else {
            // Clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }


        sc.close();
    }
}