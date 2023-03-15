import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(6);

        List l2  = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(4);
        l2.add(5);
        l2.add(5);

        System.out.println(sumOfTwoNumbers(l1,l2));
    }

    public static List<Integer> sumOfTwoNumbers(List<Integer> l1,List<Integer> l2){
        List<Integer> l=new ArrayList<>();
        int count=0;
        if(l1.size()> l2.size()){
        while(count<l2.size()){
            l.add(l1.get(count)+ l2.get(count));
            count++;
        }
        for(int i=l2.size();i< l1.size();i++){
            l.add(l1.get(i));
        }

        }
        else{
            while(count<l1.size()){
                l.add(l1.get(count)+ l2.get(count));
                count++;
            }
            for(int i=l1.size();i< l2.size();i++){
                l.add(l2.get(i));
            }

        }
        return l;
    }
}
