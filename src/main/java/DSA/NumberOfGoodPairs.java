package DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] arr={1,2,3};
     HashMap<Integer,ArrayList> hm=NumberOfGoodPairs.findGoodPairs(arr);
        System.out.println("There are "+hm.size()+" good pairs");
        for(ArrayList<Integer> a:hm.values()){
            System.out.println(a);
        }
    }

    public static HashMap findGoodPairs(int[] arr){

        int count=0;
        HashMap<Integer, ArrayList<Integer>> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j] && j>i ){
                    ArrayList<Integer> a= new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    hm.put(count++,a);
                }
            }
        }
        return hm;
    }
}
