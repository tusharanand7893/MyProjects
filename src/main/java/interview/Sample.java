package interview;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {

        System.out.println(fabonnaci(5,25));
    }

    public static List<Integer> fabonnaci(int j,int n){
        List<Integer> l= new ArrayList<>();
        l.add(j);
        l.add(j+1);
        List<Integer> finallist= new ArrayList<>();
        for(int i=2;i<=n;i++){
            int value=l.get(i-1)+l.get(i-2);
            l.add(value);
            if(value%3==0){
                finallist.add(value);
            }else {

            }
        }
        System.out.println(l);
return finallist;
    }
}
