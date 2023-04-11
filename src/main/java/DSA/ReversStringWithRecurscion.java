package DSA;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ReversStringWithRecurscion {
    public static void main(String[] args) {
       System.out.println(ReversStringWithRecurscion.reverseString("987654321"));
       ReversStringWithRecurscion.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public static String reverseString(String str){

        if(str==null){
            throw new RuntimeException("String cannot be null");
        }

        if(str.length()-1==0){
            return String.valueOf(str.charAt(0));
        }

       return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    }

    public static void reverseString(char[] s){
        System.out.println(s);
     ArrayList<String> a= new ArrayList<>();
     for(int i=s.length-1;i>=0;i--){
         a.add(String.valueOf(s[i]));
     }
        System.out.println(String.valueOf(a));
    }
}
