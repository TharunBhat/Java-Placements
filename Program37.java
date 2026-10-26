1D
public class Program37 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 33, 44, 55, 60};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                evenSum += numbers[i];
            else
                oddSum += numbers[i];
        }

        System.out.println("In 1D array:");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

2D
public class Program37 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0)
                    evenSum += numbers[i][j];
                else
                    oddSum += numbers[i][j];
            }
        }

        System.out.println("In 2D array:");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

3D
public class Program37 {
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

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    if (numbers[i][j][k] % 2 == 0)
                        evenSum += numbers[i][j][k];
                    else
                        oddSum += numbers[i][j][k];
                }
            }
        }

        System.out.println("In 3D array:");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
