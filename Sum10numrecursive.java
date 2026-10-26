public class Sum10numrecursive
 {
    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println("Sum: " + sum);
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
