import java.util.Scanner;

public class Maximum_and_Minimum_Element_in_an_Array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer for array index " + i + ": ");
            arr[i] = sc.nextInt();
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Maximum and Minimum Element in Array is " + max + " " + min + " respectively");

        sc.close();
    }
}
