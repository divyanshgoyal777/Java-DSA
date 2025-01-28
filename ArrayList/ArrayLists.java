import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(5);
        System.out.println(list);

        System.out.println(list.get(1));

        list.add(1, 99);
        System.out.println(list);

        list.set(1, 100);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
