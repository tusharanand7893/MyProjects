package generalProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringAnagrams {

    public static void main(String[] args) {
        String[] arr={"cat", "dog", "tac", "god", "act","mice","nice","triangle","angletri"};
        printAnagrams(arr);

    }

    public static void printAnagrams(String[] arr){
        for(int i=0;i<arr.length;i++){
            List<String> al=checkAnagrams(arr,arr[i]);
            al.remove(arr[i]);
            if(al.isEmpty()){
                System.out.println("No Anagrams for "+arr[i]);
            }
            else{
                System.out.println("Anagrams for "+arr[i]+ ": "+al);
            }
        }
    }

    public static List<String> checkAnagrams(String[] arr, String s){
        List<String> anagrams= new ArrayList<>();
        List<String> matchedLength= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(s.length()==arr[i].length()){
                matchedLength.add(arr[i]);
            }
        }

        for(String a:matchedLength){
            if(checkChar(s).equals(checkChar(a))){
                anagrams.add(a);
            }
        }
        return anagrams;
    }

    public static TreeSet<Character> checkChar(String s){
        TreeSet<Character> tsChar= new TreeSet<>();
        for(int i=0;i<s.length();i++){
            tsChar.add(s.charAt(i));
        }
        return tsChar;
    }
}
