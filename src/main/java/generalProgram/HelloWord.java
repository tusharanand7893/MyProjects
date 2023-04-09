package generalProgram;

import java.util.HashSet;
import java.util.Set;

class HelloWorld {
    public static void main(String[] args) {
        String s="anando";
        nonRepativeChar(s);
    }

    public static void nonRepativeChar(String str){
        char[] arr=str.toCharArray();
        Set<Character> hs= new HashSet<>();
        for(Character c: arr){
            if(hs.add(c)==false){
               hs.remove(c);
            }
            else{hs.add(c);}
        }

        for(Character c:hs){
            System.out.println(c);
        }
    }
}
