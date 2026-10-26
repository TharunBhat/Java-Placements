1D
import java.util.List;
import java.util.ArrayList;

public class Program32 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            l.add(arr[i]);
        }
        System.out.println(l);
    }
}

2D
import java.util.ArrayList;
import java.util.Arrays;

public class Program32 {
    public static void main(String[] args) {
        Integer[][] numbers = {
            {10, 20},
            {30, 70},
            {50, 60}
        };
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (Integer[] row : numbers) {
            list.add(new ArrayList<>(Arrays.asList(row)));
        }

        System.out.println("2D Array converted to ArrayList:");
        System.out.println(list);
    }
}

3D
import java.util.ArrayList;
import java.util.Arrays;

public class Program32 {
    public static void main(String[] args) {
        Integer[][][] numbers = {
            {
                {10, 20},
                {30, 40}
            },
            {
                {50, 60},
                {70, 80}
            }
        };

        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();

        for (Integer[][] block : numbers) {
            ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
            for (Integer[] row : block) {
                twoDList.add(new ArrayList<>(Arrays.asList(row)));
            }
            list.add(twoDList);
        }

        System.out.println("3D Array converted to ArrayList:");
        System.out.println(list);
    }
}

