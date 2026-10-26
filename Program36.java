1D
public class Program36 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of all elements in 1D array: " + sum);
    }
}

2D
public class Program36 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Sum of all elements in 2D array: " + sum);
    }
}

3D
public class Program36 {
    public static void main(String[] args) {
        int[][][] numbers = {
            {
                {10, 20},
                {30, 40}
            },
            {
                {50, 60},
                {70, 80}
            }
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    sum += numbers[i][j][k];
                }
            }
        }

        System.out.println("Sum of all elements in 3D array: " + sum);
    }
}
