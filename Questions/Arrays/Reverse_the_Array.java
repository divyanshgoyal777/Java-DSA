import java.util.Scanner;

public class Reverse_the_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no. " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before reverse: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int left = 0, right = size - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("\nArray after reverse: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
