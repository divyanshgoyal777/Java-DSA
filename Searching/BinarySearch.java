import java.util.*;

public class BinarySearch {
    public static int Search(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int result = Search(arr, target);
        if (result != -1) {
            System.out.println("Target found at " + result + " index");
        } else {
            System.out.println("Target not found");
        }
        sc.close();
    }
}
