package DSA;

import java.util.HashSet;
import java.util.Set;

public class Biinary {
    public static void main(String[] args) {
        int i=19;
        System.out.println(solution(i));
    }
    public int solution1(int N) {
        // Implement your solution here

        String convertedBinary=Integer.toBinaryString(N);
        int gap=0;
        for(int i=0;i<convertedBinary.length();i++){

        }return gap;
    }




    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    public static int solution(int N) {
            // Implement your solution here

            String convertedBinary=Integer.toBinaryString(N);
            int gap=0;

            for(int i=0;i<convertedBinary.length()-1;i++){

                if(convertedBinary.charAt(i)=='1'&& convertedBinary.charAt(i+1)=='0'){
                    int count=0;
                    i++;
                    while(convertedBinary.charAt(i)!='1' && i<convertedBinary.length()-1){
                        count++;
                        i++;
                        if(convertedBinary.length()-1==i){
                            count=0;
                        }

                    }
                    if(count>gap){
                        gap=count;
                    }
                }

            }
            return gap;
        }


}
