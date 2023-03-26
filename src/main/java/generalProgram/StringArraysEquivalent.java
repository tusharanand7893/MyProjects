package generalProgram;

import java.util.HashSet;

public class StringArraysEquivalent {
    public static void main(String[] args) {

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        boolean flag=false;
        if(word1==null || word2==null){
            flag=false;
        }
        for(int i=0;i< word1.length;i++){
            str1=str1+word1[i];
        }
        for(int i=0;i< word2.length;i++){
            str2=str2+word2[i];
        }
        if(str1.equalsIgnoreCase(str2)){
           flag=true;
        }

return flag;
    }
}
