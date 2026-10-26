1D
public class Program34 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 33, 44, 55, 60};

        System.out.println("Odd numbers in 1D array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}

2D
public class Program34 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };

        System.out.println("Odd numbers in 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 != 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}

3D
public class Program34 {
    public static void main(String[] args) {
        int[][][] numbers = {
            {
                {10, 15, 22},
                {33, 44, 55}
            },
            {
                {60, 71, 80},
                {90, 101, 120}
            }
        };

        System.out.println("Odd numbers in 3D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    if (numbers[i][j][k] % 2 != 0) {
                        System.out.println(numbers[i][j][k]);
                    }
                }
            }
        }
    }
}
