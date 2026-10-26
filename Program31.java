1D
public class Program31 {
    public static void main(String[] args) {
        String[] names={"swasthik", "tejas", "tharun", "vishwakant"};
        for(int i=names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }
    }
}

2D
public class Program31 {
    public static void main(String[] args) {
        String[][] names = {
            {"A", "B"},
            {"C", "D"},
            {"E", "F"}
        };

        System.out.println("Names in reverse order (2D array):");
        for (int i = names.length - 1; i >= 0; i--) {
            for (int j = names[i].length - 1; j >= 0; j--) {
                System.out.println(names[i][j]);
            }
        }
    }
}

3D
public class Program31 {
    public static void main(String[] args) {
        String[][][] names = {
            {
                {"A", "B"},
                {"C", "D"}
            },
            {
                {"E", "F"},
                {"G", "H"}
            }
        };

        System.out.println("Names in reverse order (3D array):");
        for (int i = names.length - 1; i >= 0; i--) {
            for (int j = names[i].length - 1; j >= 0; j--) {
                for (int k = names[i][j].length - 1; k >= 0; k--) {
                    System.out.println(names[i][j][k]);
                }
            }
        }
    }
}
