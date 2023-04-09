package generalProgram;

import java.util.HashMap;

public class SplitString {

    public static void main(String[] args) {
        String str="Test Automation and Test Automation framework";
        numberOfOccurrenceOfWords(str);
    }

    public static void numberOfOccurrenceOfWords(String s){
        String[] str=s.split(" ");
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<str.length;i++){
            if(hs.containsKey(str[i])){
                hs.put(str[i],(hs.get(str[i])+1));
            }
            else{
                hs.put(str[i],1);
            }
        }
        System.out.println(hs);
    }
}
