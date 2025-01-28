public class TotalPathInMaze {
    public static int count(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int countDown = count(i + 1, j, n, m);
        int countRight = count(i, j + 1, n, m);
        return countDown + countRight;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        int paths = count(0, 0, n, m);
        System.out.println(paths);
    }
}
