package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringOnLength {

    public static void main(String[] args) {
        String[] arr={"mars","jupiter","on","jug","saturn","five","mars"};
       // sortString(arr);
        sortStringWithSelectionSort(arr);

    }

    public static void sortString(String[] arr){
        ArrayList<Integer> lenList= new ArrayList<>();
        for(String a:arr){
            lenList.add(a.length());
        }
        Collections.sort(lenList);

        ArrayList<String> reqList= new ArrayList<>();
        for(Integer i:lenList){
            for(int j=0;j<arr.length;j++){
                if(arr[j].length()==i && !reqList.contains(arr[j])){
                    reqList.add(arr[j]);
                }
            }
        }
        System.out.println(reqList);
    }

    public static void sortStringWithSelectionSort(String[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j].length()<arr[j-1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

      List<String> ls= Arrays.asList(arr);
        System.out.println(ls);
    }



}
