package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maserk {

    public static void main(String[] args) {

       // o/p = {1,2,3,2,2,0,0,0,0,0}
                int[] a={1,0,2,0,3,0,2,2,0,0};
        //System.out.println(a);
              f1(a);
    }


    public static void f1(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]==0){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        List<Integer> l= Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(l);

        //select min(Salary) from table where salary in (select salary from table order by salary desc limit 2)


    }
}
