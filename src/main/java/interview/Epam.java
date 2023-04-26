package interview;

import java.util.ArrayList;
import java.util.List;

public class Epam {

    public static void main(String[] args) {
        String test="my name is testing automation";
        System.out.println(convertString(test));
        List<String> a= new ArrayList<>();
        List<String> b= new ArrayList<>();
        a.add("Test");
        b.add("Game");
        System.out.println(mergeTwoList(a,b));
    }

    public static String convertString(String s){
        String[] str= s.split(" ");
        String result="";
        for(String arr:str){
            result=result+" "+convertUpper(arr);
        }
        return result;
    }

    public static String convertUpper(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            if(i==0){
                r=(r+s.charAt(i)).toUpperCase();
            }
           else{ r=r+s.charAt(i);}
        }

        return r;
    }

    public static List<String> mergeTwoList(List<String> l1, List<String> l2){
         l1.addAll(l2);
         return l1;
    }
}
