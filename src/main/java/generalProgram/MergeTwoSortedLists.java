package generalProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
      List<Integer> l1=new ArrayList<>();
      l1.add(1);l1.add(2);l1.add(4);
      List<Integer> l2=new ArrayList<>();
      l2.add(1);l2.add(2);l2.add(5);

        System.out.println(mergeTwoList1(l1,l2));

    }


    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> l=new ArrayList<>();
        for(int i=0; i<list1.size();i++){
        for(int j=0;j<list2.size();j++){
                if(list1.get(i)<list2.get(j)){
                    l.add(list1.get(i));
                }
                else if(list1.get(i)>list2.get(j)){
                    l.add(list1.get(j));
                }
                else{
                    l.add(list1.get(j));
                    l.add(list1.get(i));
                }
            }

        } return l;

    }

    public static List<Integer> mergeTwoList1(List<Integer> list1, List<Integer> list2){
        Set<Integer> s= new TreeSet<>();
        s.addAll(list1);
        s.addAll(list2);
        List<Integer> al=new ArrayList<>();
        for(Integer a:s){
            al.add(a);
        }

        return al;
    }
}
