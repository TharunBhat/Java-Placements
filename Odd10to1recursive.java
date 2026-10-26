public class Odd10to1recursive {
    public static void main(String[] args) {
        print(9);
    }

    static void print(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        print(n - 2);
    }
}
