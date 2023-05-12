package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FNZ {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        int num=2;
        list.add(2); list.add(1); list.add(3); list.add(4); list.add(1); list.add(3); list.add(2); list.add(1); list.add(4);
        System.out.println(doubleNumber(list,num));
    }

    //double the number if its present in arrayList [1,2,3,4,6], num =2 expected O/P= 8
    public static int doubleNumber(List<Integer> list, int num){
        Collections.sort(list);
        for(Integer a:list){
            if(a==num){
                num=num*2;
            }
        }

        return num;
    }
}
