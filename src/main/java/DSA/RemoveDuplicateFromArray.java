package DSA;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] A={9, 3, 9, 3,5, 9, 7, 9,6};
        System.out.println(RemoveDuplicateFromArray.solution(A));
    }

    public static int solution(int[] A) {
        // Implement your solution here
        int a=0;
        Set<Integer> hs= new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
            if(hs.add(A[i])==true){
                hs.add(A[i]);
            }
            else if(hs.add(A[i])==false){
                hs.remove(A[i]);
            }
        }
        System.out.println(hs);
        for(Integer i:hs){
            a=i;
        } return a;
    }
}
