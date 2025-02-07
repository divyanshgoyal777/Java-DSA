import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String args[]) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        sc.close();

        // Linear Search

        // for (int i = 0; i < arr.length; i++) {
        // if (target == arr[i]) {
        // System.out.println("Target found");
        // break;
        // }
        // }

        // Binary Search

        int left = 0, right = arr.length - 1;
        boolean flag = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Target found at " + mid + " index.");
                flag = true;
                break;
            }
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= arr[right] && target > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        if (!flag)
            System.out.println("Target not found.");
    }
}
