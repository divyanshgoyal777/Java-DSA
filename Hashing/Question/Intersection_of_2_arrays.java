import java.util.HashSet;

public class Intersection_of_2_arrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 4, 7, 4, 2, 1, 4, 6, 8, 9, 1, 0 };

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int el : arr1) {
            set.add(el);
        }

        for (int el : arr2) {
            if (set.contains(el)) {
                set.remove(el);
                count++;
            }
        }

        System.out.println(count);
    }
}
