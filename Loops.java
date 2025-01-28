public class Loops {
    public static void main(String args[]) {
        int i = 0, k = 10;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        do {
            System.out.print(k + " ");
            k--;
        } while (k > 0);
    }
}
