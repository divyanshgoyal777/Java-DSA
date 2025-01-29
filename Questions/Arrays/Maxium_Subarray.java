import java.util.Scanner;

public class Maxium_Subarray {
    public static int subarray(int[] arr, int size, int[] indices) {
        int maxSum = arr[0], currSum = arr[0];
        int start = 0, end = 0, tempStart = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > currSum + arr[i]) {
                currSum = arr[i];
                tempStart = i;
            } else {
                currSum = currSum + arr[i];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        indices[0] = start;
        indices[1] = end;
        return maxSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] indices = new int[2];
        int max = subarray(arr, size, indices);

        System.out.print("Maximum Subarray: ");
        for (int i = indices[0]; i <= indices[1]; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nMaximum Subarray sum: " + max);

        sc.close();
    }
}
