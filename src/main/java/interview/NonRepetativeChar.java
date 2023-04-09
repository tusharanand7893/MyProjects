package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetativeChar {
    public static void main(String[] args) {
        String s="Teesstnnngg jjfjn";
        s=s.toLowerCase();
        Map<Character,Integer> charMap= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            int count=1;
            if(s.charAt(i)!=' ' && charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i),count+1);
            }
            else{charMap.put(s.charAt(i),count);}

        }
        System.out.println(charMap);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && charMap.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
