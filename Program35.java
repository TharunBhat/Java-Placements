1D
public class Program35 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 33, 44, 55, 60};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("In 1D array:");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

2D
public class Program35 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
        }

        System.out.println("In 2D array:");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

3D
public class Program35 {
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

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    if (numbers[i][j][k] % 2 == 0)
                        evenCount++;
                    else
                        oddCount++;
                }
            }
        }

        System.out.println("In 3D array:");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
