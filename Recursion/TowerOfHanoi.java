public class TowerOfHanoi {
    public static void Hanoi(int n, String src, String hpr, String des, int[] count) {
        if (n == 1) {
            System.out.println("Step " + count[0] + ": Transfer disk " + n + " from " + src + " to " + des);
            count[0]++;
            return;
        }
        Hanoi(n - 1, src, des, hpr, count);
        System.out.println("Step " + count[0] + ": Transfer disk " + n + " from " + src + " to " + des);
        count[0]++;
        Hanoi(n - 1, hpr, src, des, count);
    }

    public static void main(String args[]) {
        int n = 3;
        int[] count = { 1 };
        System.out.println("Tower of Hanoi Solution for " + n + " disks:");
        Hanoi(n, "S", "H", "D", count);
    }
}
