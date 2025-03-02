import java.util.HashSet;

public class Union_of_2_arrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 7, 8, 10 };
        int arr2[] = { 2, 1, 4, 5, 2, 3, 52, 634, 64, 8589, 5, 7, 4, 7, 8, 3, 5, 1, 6, 8, 8, 9, 0 };

        HashSet<Integer> set = new HashSet<>();
        for (int el : arr1) {
            set.add(el);
        }
        for (int el : arr2) {
            set.add(el);
        }
        System.out.println(set);
        System.out.println("Size of set: " + set.size());
    }
}
