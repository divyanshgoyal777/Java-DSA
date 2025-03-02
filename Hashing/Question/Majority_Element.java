import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 5, 1, 1, 1, 2, 2, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key + " = " + map.get(key));
            }
        }
    }
}
