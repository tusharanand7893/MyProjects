package interview;

import java.util.*;

public class PhonePe {

    public static void main(String[] args) {
        //“ABDEFGABEF”  -> “BDEFGA” and “DEFGAB”
        //6
        //
        //“BBBB”
        //1
        String s="ABDEFGABEFSTUVW"; //ABDEFGABEF
        System.out.println(subStringCount1(s));
       // countChar(s);
    }
    //

    public static int subStringCount(String s){
        HashSet<Character> hs= new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(hs.add(s.charAt(i))){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }


    public static int subStringCount1(String s){
        List<String> l= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    l.add(s.substring(i,j));
                    break;
                }
                if(j==s.length()-1){
                    l.add(s.substring(i,j));
                    break;
                }

            }
        }
        int maxCount=0;
        for(String subSt:l){
            if(subSt.length()>maxCount){
                maxCount=subSt.length();
            }
        }

        return maxCount;
    }


    public static void countChar(String s){
        LinkedHashMap<Character, Integer> hm= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),(hm.getOrDefault(s.charAt(i),0))+1);
        }
        System.out.println(hm);
    }


    // src/main- htttp- Res, Resp, clinet- get, post,put, utlity- DB, modules- dataprovider, proty, csv, json, lsi, ex, resourc
    //src/ test- packahe feature- test, res

}
