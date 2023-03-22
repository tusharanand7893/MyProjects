package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RankTransformOfArray {

    public static void main(String[] args) {
        int[] a={100,100,100};
       int[] a1=RankTransformOfArray.arrayRankTransform(a);
        for(int s:a1){
            System.out.println(s);
        }
    }

    public static int[] arrayRankTransform(int[] arr) {

        ArrayList<Integer> list=new ArrayList<>();
        int[] rankarray= new int[arr.length];
        int rank=1;
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:list){
            if(!hm.containsKey(a)) {
                hm.put(a, rank);
                rank++;
            }
        }

        for(int i=0;i<arr.length;i++){
            rankarray[i]=hm.get(arr[i]);
        }
        return rankarray;

    }
}
