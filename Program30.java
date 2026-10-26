1D
public class Program30 {
    public static void main(String[] args) {
        String[] names={"swasthik", "tejas", "tharun", "vishwakant"};
        for(String ele:names){
            System.out.println(ele);
        }
    }
}

2D
public class Program30 {
    public static void main(String[] args) {
        String[][] names = {
            {"A", "B"},
            {"C", "D"},
            {"E", "F"}
        };

        System.out.println("All names in 2D array:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
    }
}

3D
public class Program30 {
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

        System.out.println("All names in 3D array:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                for (int k = 0; k < names[i][j].length; k++) {
                    System.out.println(names[i][j][k]);
                }
            }
        }
    }
}


