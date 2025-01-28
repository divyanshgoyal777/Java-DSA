public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = { 2, 6, 73, 0, 3, 13, 23, 4, 2, 43, 3, 52, 1 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}