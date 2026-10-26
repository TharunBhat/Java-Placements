1D
public class Program38 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int skipElement = 30;

        System.out.println("1D Array :");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == skipElement)
                continue; 
            System.out.println(numbers[i]);
        }
    }
}

2D
public class Program38 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int skipElement = 50;

        System.out.println("2D Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == skipElement)
                    continue; // skip the particular element
                System.out.println(numbers[i][j]);
            }
        }
    }
}

3D
public class Program38 {
    public static void main(String[] args) {
        int[][][] numbers = {
            {
                {10, 20, 30},
                {40, 50, 60}
            },
            {
                {70, 80, 90},
                {100, 110, 120}
            }
        };
        int skipElement = 80;

        System.out.println("3D Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    if (numbers[i][j][k] == skipElement)
                        continue; // skip that element
                    System.out.println(numbers[i][j][k]);
                }
            }
        }
    }
}
