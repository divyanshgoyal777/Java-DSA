import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = { 2, 6, 73, 0, 3, 13, 23, 4, 2, 43, 3, 52, 1 };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Target found at " + i);
            } else {
                System.out.println("Target not found");
            }
        }
        sc.close();
    }
}
