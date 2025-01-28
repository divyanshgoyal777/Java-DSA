import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addLast(3);
        list.addLast(4);
        list.addFirst(1);
        list.add(10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove();
        list.removeLast();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
