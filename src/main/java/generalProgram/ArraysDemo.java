package generalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
    int[] array={1,2,7,6,5,2,1,9,8,6,4};
    sortArray(array);
    List<Integer> a=arrayList();
        System.out.println(a);
    a.remove(a.indexOf(210));
        System.out.println(a);
    }

    public static int[] sortArray(int[] a){
        Arrays.sort(a);
        return a;
    }


    public static List<Integer> arrayList(){
        List<Integer> a= new ArrayList<>();
        a.add(2);  a.add(1);  a.add(0);  a.add(7);  a.add(9);  a.add(210);  a.add(5);
        return a;
    }

}
