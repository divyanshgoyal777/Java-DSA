public class Operators {
    public static void main(String args[]) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus
        System.out.println("c % a = " + (c % a)); // Modulus
        System.out.println("a++   = " + (a++)); // Post-increment
        System.out.println("a--   = " + (a--)); // Post-decrement
        System.out.println("d++   = " + (d++)); // Post-increment
        System.out.println("++d   = " + (++d)); // Pre-increment

        // Relational Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x == y = " + (x == y)); // Equal to
        System.out.println("x != y = " + (x != y)); // Not equal to
        System.out.println("x && y = " + (x && y)); // Logical AND
        System.out.println("x || y = " + (x || y)); // Logical OR
        System.out.println("!(x && y) = " + !(x && y)); // Logical NOT

        // Bitwise Operators
        a = 60; // 60 in binary: 0011 1100
        b = 13; // 13 in binary: 0000 1101
        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("~a = " + ~a); // Bitwise Complement
        System.out.println("a << 2 = " + (a << 2)); // Left shift
        System.out.println("a >> 2 = " + (a >> 2)); // Right shift
        System.out.println("a >>> 2 = " + (a >>> 2)); // Unsigned right shift

        // Assignment Operators
        a = 10;
        b = 20;
        c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a; // c = c + a
        System.out.println("c += a = " + c);
        c -= a; // c = c - a
        System.out.println("c -= a = " + c);
        c *= a; // c = c * a
        System.out.println("c *= a = " + c);
        c /= a; // c = c / a
        System.out.println("c /= a = " + c);
        c %= a; // c = c % a
        System.out.println("c %= a = " + c);
        c <<= 2; // c = c << 2
        System.out.println("c <<= 2 = " + c);
        c >>= 2; // c = c >> 2
        System.out.println("c >>= 2 = " + c);
        c &= a; // c = c & a
        System.out.println("c &= a = " + c);
        c ^= a; // c = c ^ a
        System.out.println("c ^= a = " + c);
        c |= a; // c = c | a
        System.out.println("c |= a = " + c);

        // Conditional Operator
        a = 10;
        b = (a == 1) ? 20 : 30; // If a == 1, b = 20; else b = 30
        System.out.println("Value of b is : " + b);
        b = (a == 10) ? 20 : 30; // If a == 10, b = 20; else b = 30
        System.out.println("Value of b is : " + b);

        // instanceof Operator
        String name = "James";
        boolean result = name instanceof String;
        System.out.println("Is 'name' an instance of String? " + result);
    }
}
