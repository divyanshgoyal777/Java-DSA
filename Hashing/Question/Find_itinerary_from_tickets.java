import java.util.HashMap;

public class Find_itinerary_from_tickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        HashMap<String, String> reverseMap = new HashMap<>();

        for (String key : map.keySet()) {
            reverseMap.put(map.get(key), key);
        }

        String start = null;
        for (String key : map.keySet()) {
            if (!reverseMap.containsKey(key)) {
                start = key;
                break;
            }
        }

        while (start != null) {
            System.out.print(start);
            String next = map.get(start);
            if (next != null) {
                System.out.print(" -> ");
            }
            start = next;
        }
    }
}