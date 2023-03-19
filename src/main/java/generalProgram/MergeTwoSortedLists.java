package generalProgram;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
      List<Integer> l1=new ArrayList<>();
      l1.add(1);l1.add(2);l1.add(4);
      List l2=l1=new ArrayList<>();
      l2.add(1);l2.add(2);l2.add(4);

        System.out.println( mergeTwoLists(l1,l2));

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
}
