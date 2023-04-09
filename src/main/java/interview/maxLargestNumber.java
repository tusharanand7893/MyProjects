package interview;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class maxLargestNumber {



    public static void main(String[] args) {
        int num=599;
        System.out.println(nextLargest(num));
    }

    public static int nextLargest(int num){
        int a=0;
        int givenNumber=num;
      //  int nextlargestNum=num;
        List<Integer> originalNumberList= returnNumberList(givenNumber);
        System.out.println(originalNumberList);

        while(a<1){
            num=num+1;
            List<Integer> increasedNumberList=returnNumberList(num);
            System.out.println(increasedNumberList);
            Set<Integer> numberset= new HashSet<>();
            numberset.addAll(increasedNumberList);
            System.out.println(numberset);
            if(numberset.size()==originalNumberList.size()){
            if(originalNumberList.containsAll(increasedNumberList)){
                a++;
            }}

        }
        return num;
    }
    public static List returnNumberList(int num){
        List<Integer> l= new ArrayList<>();
        while (num>0){
            l.add(num%10);
            num=num/10;
        }
        return l;
    }
}
