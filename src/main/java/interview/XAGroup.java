package interview;

import java.util.HashMap;

public class XAGroup {
    public static void main(String[] args) {


        String s="my name is Tusharrrr";
        f1(s);
    }


    public static void f1(String s){

        HashMap<Character,Integer> hm= new HashMap<>();
        HashMap<Character,Integer> resultmap= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                }
                else{
                    hm.put(s.charAt(i),1);
                }
            }
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(hm.get(s.charAt(i))>1){
                    resultmap.put(s.charAt(i),hm.get(s.charAt(i)));
                }
            }}
        System.out.println(resultmap);
    }
}
