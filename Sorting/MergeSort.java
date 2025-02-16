public class MergeSort {

    public static void conquer(int[] arr, int si, int ei, int mid) {
        int[] result = new int[ei - si + 1];

        int index1 = si;
        int index2 = mid + 1;
        int resultIndex = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                result[resultIndex++] = arr[index1++];
            } else {
                result[resultIndex++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            result[resultIndex++] = arr[index1++];

        }

        while (index2 <= ei) {
            result[resultIndex++] = arr[index2++];
        }

        for (int i = 0; i < result.length; i++) {
            arr[si + i] = result[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1, 6, 8, 2, 3, 4, 88, 34, 12, 0, 1 };
        int ei = arr.length - 1;
        divide(arr, 0, ei);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
