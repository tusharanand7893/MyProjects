package DSA;

import java.util.Collection;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a={1,2,4,6,7,9,10,13,15};
        System.out.println("Element present at index "+BinarySearch.binarySearch(a,2));
    }

    public static int binarySearch(int[] arr,int elementToSearch){
        int left=0;
        int right= arr.length-1;
        int middle=0;
        while(left<=right){
            middle=(left+right)/2;
            if(arr[middle]==elementToSearch){
                return middle;
            }else if (arr[middle]<elementToSearch) {
                left=middle+1;
            }
            else{
                right=middle-1;
            }
        }
        if(arr[middle]!=elementToSearch){
            return -1;

        }
        return middle;
    }
}
