import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(6);
        set.add(3);
        set.add(5);
        set.add(1);

        System.out.println(set.size());

        System.out.println(set);

        if (set.contains(2)) {
            System.out.println("Contain");
        } else {
            System.out.println("Not contain");
        }

        set.remove(2);

        if (set.contains(2)) {
            System.out.println("Contain");
        } else {
            System.out.println("Not contain");
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
