import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "Divyansh");
        map.put(2, "Ram");
        map.put(3, "Shyam");
        map.put(4, "Rahul");

        System.out.println(map);

        if (map.containsKey(3)) {
            System.out.println("Key exists");
        } else {
            System.out.println("Not exists");
        }

        System.out.println(map.get(3));

        if (map.containsKey(23)) {
            System.out.println("Key exists");
        } else {
            System.out.println("Not exists");
        }

        System.out.println(map.get(23));

        if (map.containsValue("ram")) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value not exists");
        }

        if (map.containsValue("Ram")) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value not exists");
        }

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove(2);
        System.out.println(map);
    }
}