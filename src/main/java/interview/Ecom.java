package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ecom {

    public static void main(String[] args) {
        int[] a={8,4,12,14};
        findMissing(a);
    }

    public static void findMissing(int[] a){


      for(int i=0;i<a.length;i++){
          for(int j=1;j<a.length-i;j++){
              if(a[j]<a[j-1]){
                  int temp=a[j];
                  a[j]=a[j-1];
                  a[j-1]=temp;
              }
          }
      }
         int min=a[0];
         int max=a[a.length-1];
         List<Integer> al= new ArrayList<>();
         for(int i:a){
             al.add(i);
         }
        List<Integer> missingNumber= new ArrayList<>();
         for(int i=min;i<max;i++){
             if(!al.contains(i)){
                 missingNumber.add(i);
             }
         }

        System.out.println(missingNumber);


    }

}
