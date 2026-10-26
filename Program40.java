1D
public class Program40 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println("Prime numbers in 1D array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

2D
public class Program40 {
    public static void main(String[] args) {
        int[][] numbers = {
            {2, 4, 5},
            {6, 7, 8},
            {9, 10, 11}
        };

        System.out.println("Prime numbers in 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (isPrime(numbers[i][j])) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

3D
public class Program40 {
    public static void main(String[] args) {
        int[][][] numbers = {
            {
                {2, 3, 4},
                {5, 6, 7}
            },
            {
                {8, 9, 10},
                {11, 12, 13}
            }
        };

        System.out.println("Prime numbers in 3D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    if (isPrime(numbers[i][j][k])) {
                        System.out.println(numbers[i][j][k]);
                    }
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
