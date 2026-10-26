1D
public class Program39 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int searchElement = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(searchElement + " found in 1D array.");
        else
            System.out.println(searchElement + " not found in 1D array.");
    }
}

2D
public class Program39 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int searchElement = 50;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == searchElement) {
                    found = true;
                    break;
                }
            }
        }

        if (found)
            System.out.println(searchElement + " found in 2D array.");
        else
            System.out.println(searchElement + " not found in 2D array.");
    }
}

3D
public class Program39 {
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
        int searchElement = 110;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    if (numbers[i][j][k] == searchElement) {
                        found = true;
                        break;
                    }
                }
            }
        }

        if (found)
            System.out.println(searchElement + " found in 3D array.");
        else
            System.out.println(searchElement + " not found in 3D array.");
    }
}
