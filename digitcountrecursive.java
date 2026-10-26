public class digitcountrecursive {
        public static void main(String[] args) {
        int num = 1234;
        System.out.println("Count: " + count(num));
    }

    static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }
}

