package DSA;

import java.util.Arrays;

public class RecursiveArrayAddition {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(findArraySum(arr));


    }

    public static int findArraySum(int[] a){
        if(a.length==1){
            return a[0];
        }
        return a[a.length-1]+findArraySum(Arrays.copyOfRange(a,0,(a.length-1)));

    }

}
