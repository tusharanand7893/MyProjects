package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPalindrome {

    public static void main(String[] args) {
      String[]  input={"ram","weds3","rrr","naman","nitin","dskjhksdjhds"};

      List<String> al= new ArrayList<>();
      int maxLen=0;
      for(int i=0; i<input.length;i++){
          if(checkPalindrom(input[i]) && maxLen<=input[i].length()){
              maxLen=input[i].length();
          }
      }
      for(int i=0;i<input.length;i++){
          if(checkPalindrom(input[i]) && maxLen==input[i].length()){
              al.add(input[i]);
          }
      }
        System.out.println(al);

        List<String> a=Arrays.stream(input).filter(LongestPalindrome::checkPalindrom).collect(Collectors.toList());
        System.out.println(a);

    }

    public static boolean checkPalindrom(String s){
        String r="";
        boolean flag=false;
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }

        if(r.equalsIgnoreCase(s)){
       flag=true;
        }
        return flag;


    }
}
