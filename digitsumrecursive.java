public class digitsumrecursive {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum: " + sum(num));
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n % 10 + sum(n / 10);
    }
}

