package interview;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class SortPerfectSq {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //I/p: {9,5,3,16,1,7,4}
        //O/p: {1,5,3,4,9,7,16} SortPerfectSq at relative position

        int[] a={9,5,3,16,1,7,4};
        List<Integer> al= new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]%1==0 && a[i]%Math.sqrt(a[i])==0){
                al.add(a[i]);
            }
        }
        Collections.sort(al);
        System.out.println(al); //find perfect sqr root
        List<Integer> rqal= new ArrayList<>();
        List<Integer> position= new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(!al.contains(a[i])){
             position.add(i);
            }
        }
        int j=0;
        for(int i=0;i<a.length;i++){
            if(position.contains(i)){
                rqal.add(a[i]);
            }else{
               rqal.add(al.get(j));
               j++;
            }

        }

        System.out.println(rqal);
    }
}
