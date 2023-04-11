package interview;

import java.util.ArrayList;
import java.util.List;

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
