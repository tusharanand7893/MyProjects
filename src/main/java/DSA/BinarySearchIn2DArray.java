package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchIn2DArray {



    public static void main(String[] args) {
        int[][] arr={{4,3,2},{2,8,1},{6,4,9},{1,7,9}};
        System.out.println("Given Array------------");
        for(int[] row:arr){
            for(int x:row){
                System.out.println(x);
            }

        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });

        System.out.println("Sorted Array---------");
        for(int[] row:arr){
            for(int x:row){
                System.out.println(x);
            }

        }


    }
}
