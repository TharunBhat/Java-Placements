 1D
public class Program41 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int size = 0;

        for (int i = 0; i < arr.length; i++)
            size++;

        System.out.println("Array size: " + size);
    }
}


2D
public class Program41 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int size = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                size++;

        System.out.println("Array size: " + size);
    }
}

3D
public class Program41 {
    public static void main(String[] args) {
        int[][][] arr = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };
        int size = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                for (int k = 0; k < arr[i][j].length; k++)
                    size++;

        System.out.println("Array size: " + size);
    }
}
