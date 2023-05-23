package generalProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MaximumSubStrings {

    public static void main(String[] args) {
String s = "ABCDEFFDEfghCBA";
solution(s);
    }
// create list of substring from s, until char are in alphabetically order , not repeating, same case(upper and lower)
    public static void solution(String s) {

        List<String> l= new ArrayList<>();
        int element=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)+1==s.charAt(i+1)){
              i++;
            }
            else{
                l.add(s.substring(element,i));
                element=i;
            }
        }

        System.out.println(l);

      //  return l.toArray(new String[l.size()]);

        //Not solved yet
    }
}
